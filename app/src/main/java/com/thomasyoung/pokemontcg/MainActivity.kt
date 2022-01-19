package com.thomasyoung.pokemontcg


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.pokemon_collection.*


class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = layoutManager

        adapter = RecyclerAdapter()
        recyclerView.adapter = adapter

        val actionBar = supportActionBar
        actionBar!!.title = "Pokemon Booster Pack Simulator"

        val getCardBtn: Button = findViewById(R.id.getCardBtn)
        val viewCollectedCards: Button = findViewById(R.id.viewCollectedCards)
        val pokemonCard: ImageView = findViewById(R.id.PokemonCard)
        val cardsLeft: TextView = findViewById(R.id.tvCardsLeft)
        val changeSetBtn: Button = findViewById(R.id.changeSetBtn)
        var cardCount = 10
        val pokemonCardsCollected = mutableListOf<String>()
        var numCardsInSet: Int = 101
        val cardsSet: String = "rocket"
        //= mutableListOf<String>("base", "jungle", "promos", "fossil", "base2", "rocket")


        Glide.with(this).load("https://images.pokemontcg.io/pl10/1_hires.png").into(pokemonCard)



        fun getCard(set: String){

            if (set == "base"){
                if (cardCount > 0){
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this).load("https://images.pokemontcg.io/base1/${randomPokemonCard.toString()}_hires.png").into(pokemonCard)
                    pokemonCardsCollected.add("https://images.pokemontcg.io/base1/${randomPokemonCard.toString()}_hires.png")
                    cardCount--
                }
            } else if (set == "jungle"){
                numCardsInSet = 64
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    com.bumptech.glide.Glide.with(this)
                        .load("https://images.pokemontcg.io/base2/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    //pokemonCardsCollected.add("https://images.pokemontcg.io/base1/${randomPokemonCard.toString()}_hires.png")
                    cardCount--
                }
            } else if (set == "promos"){
                numCardsInSet = 53
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    com.bumptech.glide.Glide.with(this)
                        .load("https://images.pokemontcg.io/basep/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            } else if (set == "fossil") {
                numCardsInSet = 62
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    com.bumptech.glide.Glide.with(this)
                        .load("https://images.pokemontcg.io/base3/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            } else if (set == "base2") {
                numCardsInSet = 62
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    com.bumptech.glide.Glide.with(this)
                        .load("https://images.pokemontcg.io/base4/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            } else if (set == "rocket"){
                numCardsInSet = 82
                if (cardCount > 0) {
                val randomPokemonCard = (1..numCardsInSet + 1).random()
                com.bumptech.glide.Glide.with(this).load("https://images.pokemontcg.io/base5/${randomPokemonCard.toString()}_hires.png").into(pokemonCard)
                cardCount--
                }
            } else if (cardCount < 0) {
                Toast.makeText(this, "No More Cards", Toast.LENGTH_SHORT).show()
            }
        }



        getCardBtn.setOnClickListener{
             cardsLeft.text = "Cards Left: ${cardCount.toString()}"
            getCard("$cardsSet")
    }

        changeSetBtn.setOnClickListener{
            cardCount = 10
            cardsSet == "base"
            tvCardsLeft.text = "Cards Left: ${(cardCount + 1).toString()}"

        }


        viewCollectedCards.setOnClickListener{

            if (recyclerView.visibility != View.VISIBLE) {
                recyclerView.visibility = View.VISIBLE
                Toast.makeText(this@MainActivity, "${pokemonCardsCollected.size}", Toast.LENGTH_SHORT).show()

            } else {
                recyclerView.visibility = View.GONE
            }
        }
    }
}




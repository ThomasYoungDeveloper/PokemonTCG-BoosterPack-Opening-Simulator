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
        val viewOtherPacksButton: Button = findViewById(R.id.viewOtherPacksBtn)
        val pokemonCard: ImageView = findViewById(R.id.PokemonCard)
        val cardsLeft: TextView = findViewById(R.id.tvCardsLeft)
        val changeSetBtn: Button = findViewById(R.id.changeSetBtn)
        var cardCount = 11
        val pokemonCardsCollected = mutableListOf<String>()
        var numCardsInSet: Int = 101
        var cardSet: String = "promos"
        val cardSetFromIntent = intent.getStringExtra("cardSet")
        cardSet = cardSetFromIntent.toString()


        Glide.with(this).load("https://images.pokemontcg.io/pl10/1_hires.png").into(pokemonCard)



        //TODO("Switch Statement or Hashmap/map")

        fun getCard(set: String){
            if (set == "base1"){
                numCardsInSet = 102
                if (cardCount > 0){
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this).load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png").into(pokemonCard)
                    //pokemonCardsCollected.add("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                    cardCount--
                }
            } else if (set == "base2"){
                numCardsInSet = 64
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this)
                        .load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    //pokemonCardsCollected.add("https://images.pokemontcg.io/base1/${randomPokemonCard.toString()}_hires.png")
                    cardCount--
                }
            } else if (set == "basep"){
                numCardsInSet = 53
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this)
                        .load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            } else if (set == "base3") {
                numCardsInSet = 62
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this)
                        .load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            } else if (set == "base4") {
                numCardsInSet = 62
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this)
                        .load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            }
//            else if (set == "base5"){
//                numCardsInSet = 82
//                if (cardCount > 0) {
//                    val randomPokemonCard = (1..numCardsInSet + 1).random()
//                    Glide.with(this)
//                    .load("https://images.pokemontcg.io/base5/1_hires.png")
//
//                cardCount--
//                }
//            }
             else if (set == "gym1") {
                numCardsInSet = 134
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this)
                        .load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            }
            else if (set == "gym2") {
                numCardsInSet = 132
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this)
                        .load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            }
            else if (set == "neo1") {
                numCardsInSet = 111
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this)
                        .load("https://images.pokemontcg.io/neo2/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                    // stops working here
                }
            }
                else if (set == "neo2") {
                    numCardsInSet = 75
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                            .into(pokemonCard)
                        cardCount--
                    }
            } else if (set == "si1") {
                numCardsInSet = 18
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this)
                        .load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            }else if (set == "neo3") {
                numCardsInSet = 66
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this)
                        .load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            }else if (set == "neo4") {
                numCardsInSet = 113
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this)
                        .load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            }
            else if (set == "base6") {
                numCardsInSet = 110
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this)
                        .load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            }
            else if (set == "swsh45sv") {
                numCardsInSet = 122
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this)
                        .load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            }
            else if (set == "ecard1") {
                numCardsInSet = 165
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this)
                        .load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            }
            else if (set == "ecard2") {
                numCardsInSet = 147
                if (cardCount > 0) {
                    val randomPokemonCard = (1..numCardsInSet + 1).random()
                    Glide.with(this)
                        .load("https://images.pokemontcg.io/$set/${randomPokemonCard.toString()}_hires.png")
                        .into(pokemonCard)
                    cardCount--
                }
            }
                else if (cardCount < 0) {
                Toast.makeText(this, "No More Cards", Toast.LENGTH_SHORT).show()
            }
        }

        getCardBtn.setOnClickListener{
             cardsLeft.text = "Cards Left: ${cardCount.toString()}"
            getCard("$cardSet")
    }

        changeSetBtn.setOnClickListener{
            cardCount = 10
            tvCardsLeft.text = "Cards Left: ${(cardCount + 1).toString()}"
            Toast.makeText(this, "$cardSet and $cardSetFromIntent" , Toast.LENGTH_SHORT).show()


        }


        viewOtherPacksBtn.setOnClickListener{

            if (recyclerView.visibility != View.VISIBLE) {
                recyclerView.visibility = View.VISIBLE

            } else {
                recyclerView.visibility = View.GONE
            }
        }
    }
}




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

        val cardValue: TextView = findViewById(R.id.tvCardValue)
        val getCardBtn: Button = findViewById(R.id.getCardBtn)
        val viewCollectedCards: Button = findViewById(R.id.viewCollectedCards)
        val pokemonCard: ImageView = findViewById(R.id.PokemonCard)
        val cardsLeft: TextView = findViewById(R.id.tvCardsLeft)
        var cardCount = 10
        var value = 0
        val pokemonCardsCollected = mutableListOf<String>()


        Glide.with(this).load("https://images.pokemontcg.io/pl10/1_hires.png").into(pokemonCard)

        getCardBtn.setOnClickListener{
             cardsLeft.text = "Cards Left: ${cardCount.toString()}"
            cardValue.text = "Value: ${value.toString()}"
            if (cardCount > 0){
                val randomPokemonCard = (1..101 + 1).random()
                Glide.with(this).load("https://images.pokemontcg.io/base1/${randomPokemonCard.toString()}_hires.png").into(pokemonCard)
                pokemonCardsCollected.add("https://images.pokemontcg.io/base1/${randomPokemonCard.toString()}_hires.png")
                cardCount--
            } else {
                Toast.makeText(this, "No More Cards", Toast.LENGTH_SHORT).show()
            }
        }

        viewCollectedCards.setOnClickListener{

            if (recyclerView.visibility != View.VISIBLE) {
                recyclerView.visibility = View.VISIBLE
                Toast.makeText(this@MainActivity, "${pokemonCardsCollected.size}", Toast.LENGTH_SHORT).show()

            } else {
                recyclerView.visibility = View.GONE
            }

            /*
            val intent = Intent(this, PokemonCardCollection:: class.java).also {
            intent.putExtra("EXTRA_ARRAY", pokemonCardsCollected.toString() )
            }
            startActivity(intent)
*/
        }



    }




}




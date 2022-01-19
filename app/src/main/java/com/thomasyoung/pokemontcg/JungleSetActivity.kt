package com.thomasyoung.pokemontcg

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


class JungleSetActivity : AppCompatActivity() {

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

        //val cardValue: TextView = findViewById(R.id.tvCardValue)
        val getCardBtn: Button = findViewById(R.id.getCardBtn)
        val viewCollectedCards: Button = findViewById(R.id.viewCollectedCards)
        val pokemonCard: ImageView = findViewById(R.id.PokemonCard)
        val cardsLeft: TextView = findViewById(R.id.tvCardsLeft)
        var cardCount = 10
        val pokemonCardsCollected = mutableListOf<String>()
        val numCardsInSet: Int = 101
        val cardsSet = "base"


        Glide.with(this).load("https://images.pokemontcg.io/pl10/1_hires.png").into(pokemonCard)

        getCardBtn.setOnClickListener{
            cardsLeft.text = "Cards Left: ${cardCount.toString()}"
            if (cardCount > 0){
                val randomPokemonCard = (1..numCardsInSet + 1).random()
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
                Toast.makeText(this@JungleSetActivity, "${pokemonCardsCollected.size}", Toast.LENGTH_SHORT).show()

            } else {
                recyclerView.visibility = View.GONE
            }




        }



    }


}
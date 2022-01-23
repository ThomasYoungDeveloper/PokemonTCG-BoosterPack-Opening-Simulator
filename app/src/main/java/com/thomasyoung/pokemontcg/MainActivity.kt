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

        val getCardBtn: Button = findViewById(R.id.getCardBtn)
        //val viewCollections: Button = findViewById(R.id.viewCollectedCards)
        val pokemonCard: ImageView = findViewById(R.id.PokemonCard)
        val cardsLeft: TextView = findViewById(R.id.tvCardsLeft)
        var cardCount = 11
        val pokemonCardsCollected = mutableListOf<String>()
        var numCardsInSet: Int
        val cardSet: String
        val cardSetChosen = intent.getStringExtra("cardSet")
        cardSet = cardSetChosen.toString()

        //TODO: ADD LOADING SPINNER
        //TODO: ADD A WAY TO VIEW CARDS YOU'VE COLLECTED
        Glide.with(this).load("https://images.pokemontcg.io/pl10/1_hires.png").into(pokemonCard)

        fun getCard(set: String) {
            when (set) {
                "base1" -> {
                    numCardsInSet = 102
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "base2" -> {
                    numCardsInSet = 64
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        //pokemonCardsCollected.add("https://images.pokemontcg.io/base1/${randomPokemonCard.toString()}_hires.png")
                        cardCount--
                    }
                }
                "basep" -> {
                    numCardsInSet = 53
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "base3" -> {
                    numCardsInSet = 62
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "base4" -> {
                    numCardsInSet = 62
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "gym1" -> {
                    numCardsInSet = 134
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "gym2" -> {
                    numCardsInSet = 132
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "neo1" -> {
                    numCardsInSet = 111
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/neo2/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                        // stops working here
                    }
                }
                "neo2" -> {
                    numCardsInSet = 75
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "si1" -> {
                    numCardsInSet = 18
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "neo3" -> {
                    numCardsInSet = 66
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "neo4" -> {
                    numCardsInSet = 113
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "base6" -> {
                    numCardsInSet = 110
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "swsh45sv" -> {
                    numCardsInSet = 122
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "ecard1" -> {
                    numCardsInSet = 165
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "ecard2" -> {
                    numCardsInSet = 147
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "ecard3" -> {
                    numCardsInSet = 182
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "ex1" -> {
                    numCardsInSet = 108
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "ex2" -> {
                    numCardsInSet = 100
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "ex3" -> {
                    numCardsInSet = 97
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "np" -> {
                    numCardsInSet = 40
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "ex4" -> {
                    numCardsInSet = 95
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "ex5" -> {
                    numCardsInSet = 101
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "ex6" -> {
                    numCardsInSet = 112
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                "swsh45" -> {
                    numCardsInSet = 72
                    if (cardCount > 0) {
                        val randomPokemonCard = (1..numCardsInSet + 1).random()
                        Glide.with(this)
                            .load("https://images.pokemontcg.io/$set/${randomPokemonCard}_hires.png")
                            .placeholder(R.drawable.loading_spinner)
                            .into(pokemonCard)
                        cardCount--
                    }
                }
                else -> {
                    Toast.makeText(this, "No More Cards", Toast.LENGTH_SHORT).show()
                }
            }
        }

        getCardBtn.setOnClickListener {
            cardsLeft.text = "Cards Left: $cardCount"
            getCard("$cardSet")
        }

        viewOtherPacksBtn.setOnClickListener {
            if (recyclerView.visibility != View.VISIBLE) {
                recyclerView.visibility = View.VISIBLE

            } else {
                recyclerView.visibility = View.GONE
            }
        }
    }


}





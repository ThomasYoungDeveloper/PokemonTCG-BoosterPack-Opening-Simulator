package com.thomasyoung.pokemontcg

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class PokemonCardCollection : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pokemon_collection)





        val actionBar = supportActionBar
        actionBar!!.title = "Your Card Collection"

        actionBar.setDisplayHomeAsUpEnabled(true)

        //${pokemonCardsCollected.toString()}

    }


}
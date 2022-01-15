package com.thomasyoung.pokemontcg

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {

    val POKEMONCARDURL = "pl1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getCardBtn: Button = findViewById(R.id.getCardBtn)
        val pokemonCard: ImageView = findViewById(R.id.PokemonCard)
        getCardBtn.setOnClickListener{
            //Toast.makeText(this, "Button works", Toast.LENGTH_SHORT).show()
            Glide.with(this).load("https://images.pokemontcg.io/pl1/1_hires.png").into(pokemonCard)
        }


    }


}


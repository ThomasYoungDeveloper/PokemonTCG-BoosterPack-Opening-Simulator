package com.thomasyoung.pokemontcg
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity



class BoosterPacksActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.booster_packs)

        val basePackBtn = findViewById<ImageView>(R.id.basePack)
        val junglePackBtn = findViewById<ImageView>(R.id.junglePack)
        val promosPackBtn = findViewById<ImageView>(R.id.promosPack)

        basePackBtn.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                intent.putExtra("base", "base")
                startActivity(it)
            }
        }
            junglePackBtn.setOnClickListener {
                Intent(this, MainActivity::class.java).also {
                    startActivity(it)
                }
            }

            promosPackBtn.setOnClickListener {
                Intent(this, MainActivity::class.java).also {
                    startActivity(it)
                }
            }



    }
}

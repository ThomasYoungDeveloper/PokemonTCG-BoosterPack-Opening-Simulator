package com.thomasyoung.pokemontcg


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


    private var titles = listOf(
        "Base",
        "Jungle",
        "Promos",
        "Fossil",
        "Base set 2",
        "Gym Heroes",
        "Gym Challenge",
        "Neo Genesis",
        "Neo Discovery",
        "Southern Islands",
        "Neo Revelation",
        "Neo Destiny",
        "Legendary Collection",
        "Expedition",
        "Aquapolis",
        "Skyridge",
        "Ruby & Sapphire",
        "Sandstorm",
        "Dragon",
        "Nintendo Promos",
        "Magma vs Aqua",
        "Hidden Legends",
        "FireRed vs LeafGreen",
        "Shining Fates"


    )

    private var details = listOf(
        "Released: 01/09/1999",
        "Released: 06/16/1999",
        "Released: 07/01/1999",
        "Released: 10/10/1999",
        "Released: 02/24/2000",
        "Released: 10/26/2000",
        "Released: 02/24/2000",
        "Released: 02/24/2000",
        "Released: 02/24/2000",
        "Released: 02/24/2000",
        "Released: 02/24/2000",
        "Released: 02/24/2000",
        "Released: 05/24/2002",
        "Released: 02/19/2021",
        "Released: 09/15/2002",
        "Released: 01/15/2003",
        "Released: 05/12/2003",
        "Released: 07/01/2003",
        "Released: 09/18/2003",
        "Released: 09/18/2003",
        "Released: ",
        "Released: ",
        "Released: ",
        "Released: ",
        "Released: "
    )
    private var images = listOf(
        R.drawable.pokemon_base1,
        R.drawable.pokemon_jungle,
        R.drawable.pokemon_promo,
        R.drawable.pokemon_fossil,
        R.drawable.base_2,
        R.drawable.gym1,
        R.drawable.gym2,
        R.drawable.neo,
        R.drawable.neo2,
        R.drawable.southern_islands,
        R.drawable.neo3,
        R.drawable.neo4,
        R.drawable.base6,
        R.drawable.ecard1,
        R.drawable.ecard2,
        R.drawable.ecard3,
        R.drawable.ex1,
        R.drawable.ex2,
        R.drawable.ex3,
        R.drawable.pokemon_promo,
        R.drawable.ex4,
        R.drawable.ex5,
        R.drawable.ex6,
        R.drawable.swsh45

    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.booster_packs, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemImage.setImageResource(images[position])
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
    }

    override fun getItemCount(): Int {
        return images.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.itemImage)
        var itemTitle: TextView = itemView.findViewById(R.id.itemTitle)
        var itemDetail: TextView = itemView.findViewById(R.id.itemDetail)


        init {
            itemView.setOnClickListener {
                when (absoluteAdapterPosition) {
                    0 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "base1")
                        itemView.context.startActivity(intent)
                    }
                    1 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "base2")
                        itemView.context.startActivity(intent)
                    }
                    2 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "basep")
                        itemView.context.startActivity(intent)
                    }
                    3 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "base3")
                        itemView.context.startActivity(intent)
                    }
                    4 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "base4")
                        itemView.context.startActivity(intent)
                    }
                    5 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "gym1")
                        itemView.context.startActivity(intent)
                    }
                    6 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "gym2")
                        itemView.context.startActivity(intent)
                    }
                    7 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "neo1")
                        itemView.context.startActivity(intent)
                    }
                    8 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "neo2")
                        itemView.context.startActivity(intent)
                    }
                    9 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "si1")
                        itemView.context.startActivity(intent)
                    }
                    10 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "neo3")
                        itemView.context.startActivity(intent)
                    }
                    11 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "neo4")
                        itemView.context.startActivity(intent)
                    }
                    12 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "base6")
                        itemView.context.startActivity(intent)
                    }
                    13 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "ecard1")
                        itemView.context.startActivity(intent)
                    }
                    14 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "ecard2")
                        itemView.context.startActivity(intent)
                    }
                    15 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "ecard3")
                        itemView.context.startActivity(intent)
                    }
                    16 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "ex1")
                        itemView.context.startActivity(intent)
                    }
                    17 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "ex2")
                        itemView.context.startActivity(intent)
                    }
                    18 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "ex3")
                        itemView.context.startActivity(intent)
                    }
                    19 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "np")
                        itemView.context.startActivity(intent)
                    }
                    20 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "ex4")
                        itemView.context.startActivity(intent)
                    }
                    21 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "ex5")
                        itemView.context.startActivity(intent)
                    }
                    22 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "ex6")
                        itemView.context.startActivity(intent)
                    }
                    23 -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "swsh45")
                        itemView.context.startActivity(intent)
                    }

                    else -> {
                        val intent = Intent(itemView.context, MainActivity::class.java)
                        intent.putExtra("cardSet", "ecard2")
                        itemView.context.startActivity(intent)
                    }
                }
            }
        }
    }
}
package com.thomasyoung.pokemontcg


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent.getIntent
import androidx.appcompat.app.AppCompatActivity


class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){


    private var titles = listOf(
        "Base", "Jungle", "Promos", "Fossil", "Base set 2"
    )

    private var details = listOf(
        "Released: 01/09/1999", "Released: 06/16/1999", "Released: 07/01/1999", "Released: 10/10/1999", "Released: 02/24/2000"
    )
    private var images = listOf(
        R.drawable.pokemon_base1,R.drawable.pokemon_jungle,R.drawable.pokemon_promo,R.drawable.pokemon_fossil, R.drawable.base_2
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_collection, parent, false)
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

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView = itemView.findViewById(R.id.itemImage)
        var itemTitle: TextView = itemView.findViewById(R.id.itemTitle)
        var itemDetail: TextView = itemView.findViewById(R.id.itemDetail)

//        var intent = getIntent()

        init {
            itemView.setOnClickListener{
                val position: Int= absoluteAdapterPosition
                TODO("Set variable 'set' to title in recycler ")
            }
        }

    }
}
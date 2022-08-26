package com.apra.songs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter :RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var title = arrayOf("Song one","Song two","Song three","Song four","Song  five","Song  six","Song  seven","Song  Eight")
    private var details = arrayOf("Item one details","Item two details","Item three details","Item four details","Item five details","Item six details","Item seven details","Item eight details")
    private val images =arrayOf(R.drawable.a,
        R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.j,R.drawable.k)

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int): ViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.cards_layout,parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return title.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text =title[position]
        holder.itemDetail.text =title[position]
        holder.itemImage.setImageResource(images[position])

    }
    inner class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        var itemImage : ImageView
        var itemTitle : TextView
        var itemDetail : TextView
        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail=itemView.findViewById(R.id.item_detail)
        }
    }
}
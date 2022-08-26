package com.apra.songs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var layoutManager:RecyclerView.LayoutManager? =null
    private var adapter : RecyclerView.Adapter<RecyclerView.ViewHolder>? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       layoutManager =LinearLayoutManager(this)

       val recyclerView =findViewById<RecyclerView>(R.id.recyclerView)
       recyclerView.layoutManager =layoutManager
         var  adapter = RecyclerAdapter()
        recyclerView.adapter =adapter
    }
}
package com.example.android_task

import android.view.LayoutInflater
import android.widget.ListView


import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.third_activity.view.*

class ItemsAdapter(var titile: List<String>) :
        RecyclerView.Adapter<ItemsAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemTitle: TextView = view.names

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.third_activity, parent, false)
        return ItemViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titile.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.itemTitle.text = titile[position]

    }
}

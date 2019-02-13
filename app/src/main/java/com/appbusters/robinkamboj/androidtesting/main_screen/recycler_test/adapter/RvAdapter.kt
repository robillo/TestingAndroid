package com.appbusters.robinkamboj.androidtesting.main_screen.recycler_test.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.appbusters.robinkamboj.androidtesting.main_screen.recycler_test.model.Data
import com.appbusters.robinkamboj.androidtesting.R

class RvAdapter(private val data: List<Data>) : RecyclerView.Adapter<RvAdapter.RvHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false)
        return RvHolder(v)
    }

    override fun onBindViewHolder(holder: RvHolder, position: Int) {
        holder.textLeft.text = data[position].textLeft
        holder.textRight.text = data[position].textRight
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class RvHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var textLeft: TextView = itemView.findViewById(R.id.textLeft)
        var textRight: TextView = itemView.findViewById(R.id.textRight)

    }
}

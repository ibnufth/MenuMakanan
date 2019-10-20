package com.example.rcwvw

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class ListAdapter(private val listmakan :ArrayList<daftar>) : RecyclerView.Adapter<ListAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback : OnItemClickCallback

    interface OnItemClickCallback {
        fun onitemClick(data:daftar)
    }

    fun setOnItemClickCallback(onItemClickCallback:OnItemClickCallback){
        this.onItemClickCallback=onItemClickCallback
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view :View = LayoutInflater.from(parent.context).inflate(R.layout.listview,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int =listmakan.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val makan =listmakan[position]
        val harga = "Rp.${makan.harga},-"
        holder.tvnama.text=makan.nama
        holder.harga.text=harga
        holder.itemView.setOnClickListener{
            onItemClickCallback.onitemClick(listmakan[holder.adapterPosition])
        }
    }

    inner class ListViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        var tvnama:TextView = itemView.findViewById(R.id.nama)
        var harga:TextView = itemView.findViewById(R.id.harga)
    }

}
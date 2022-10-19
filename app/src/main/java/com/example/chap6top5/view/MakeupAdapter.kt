package com.example.chap6top5.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.chap6top5.databinding.ItemMakeupBinding
import com.example.chap6top5.model.ResponseDataMakeupItem

class MakeupAdapter(var listmakeup : List<ResponseDataMakeupItem>): RecyclerView.Adapter<MakeupAdapter.ViewHolder>(){
    class ViewHolder(var binding : ItemMakeupBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakeupAdapter.ViewHolder {
        var view = ItemMakeupBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MakeupAdapter.ViewHolder, @SuppressLint("RecyclerView") position: Int) {
        holder.binding.name.text = listmakeup[position].name
        holder.binding.price.text = listmakeup[position].price.toString()
        holder.binding.brand.text = listmakeup[position].brand
        Glide.with(holder.itemView.context).load(listmakeup[position].imageLink).into(holder.binding.imgMakeup)
    }

    override fun getItemCount(): Int = listmakeup.size
}
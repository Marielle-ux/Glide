package com.example.listproject

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listproject.databinding.ExampleAdapterBinding


class ExampleRecyclerAdapter() : RecyclerView.Adapter<ExampleRecyclerAdapter.ExampleViewHolder>() {
    private val adapterList = mutableListOf<Product>()

    inner class ExampleViewHolder(private var binding: ExampleAdapterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: Product) {
            binding.TvProductTitle.text = item.title
            binding.TvProductPrice.text = item.number.toString()
        }
    }

    fun submitList(list: List<Product>) {
        adapterList.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        return ExampleViewHolder(
            ExampleAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    override fun getItemCount(): Int {
        return adapterList.size
    }
    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        holder.onBind(adapterList[position])
    }
}
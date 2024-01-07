package com.onurcem.feature.search_list.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onurcem.feature.search_list.databinding.LayoutSearchItemBinding

class SearchListAdapter(private val onClickListener : ((String)->Unit)) : RecyclerView.Adapter<SearchListAdapter.SearchListViewHolder>() {

    private val list = mutableListOf<String>()

    fun updateList(newList: List<String>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SearchListViewHolder(
        LayoutSearchItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: SearchListViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item,onClickListener)
    }

    class SearchListViewHolder(private val binding: LayoutSearchItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String, onClickListener: (String) -> Unit) {
            binding.apply {
                root.setOnClickListener {
                    onClickListener(item)
                }
                tvName.text = item
            }
        }
    }
}
package com.ss.mysmoothiesample.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ss.mysmoothiesample.R
import com.ss.mysmoothiesample.databinding.ListitemHomeMainBinding
import com.ss.mysmoothiesample.home.HomeItemTypes
import com.ss.mysmoothiesample.home.HomeItems
import com.ss.mysmoothiesample.home.HomeMainItems

class HomeItemMainAdapter(private val context: Context, private val homeMainItemsMap: Map<HomeItemTypes, List<HomeItems>>) : RecyclerView.Adapter<HomeItemMainAdapter.HomeItemMainViewHolder>() {

    private val categories = homeMainItemsMap.keys.toList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeItemMainViewHolder {
        val inflater = LayoutInflater.from(context)
        val binding = DataBindingUtil.inflate<ListitemHomeMainBinding>(inflater,
            R.layout.listitem_home_main,parent, false )
        return HomeItemMainViewHolder(context, binding)
    }

    override fun getItemCount(): Int = homeMainItemsMap.size

    override fun onBindViewHolder(holder: HomeItemMainViewHolder, position: Int) {
        val title = categories.get(position)
        val children = homeMainItemsMap[title]
        holder.bind(HomeMainItems(title.type, children))
    }


    class HomeItemMainViewHolder(private val context: Context, private val binding: ListitemHomeMainBinding) : RecyclerView.ViewHolder(binding.root){

        private val linearlayoutManager : LinearLayoutManager = LinearLayoutManager(context).apply { orientation = RecyclerView.HORIZONTAL }

        fun bind(homeMainItems: HomeMainItems){
            val adapter = HomeItemChildAdapter(context, homeMainItems.children)
            binding.homeListHeaderTitle.text = homeMainItems.title
            binding.homeListChildlist.adapter = adapter
            binding.homeListChildlist.layoutManager = linearlayoutManager
        }
    }
}
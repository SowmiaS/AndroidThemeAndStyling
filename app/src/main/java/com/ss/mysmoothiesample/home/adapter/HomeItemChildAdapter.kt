package com.ss.mysmoothiesample.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ss.mysmoothiesample.R
import com.ss.mysmoothiesample.databinding.ListitemHomeAlignCategoryBinding
import com.ss.mysmoothiesample.home.HomeItems

const val HOMEITEM_CHILD_SIZE = 88

class HomeItemChildAdapter(val context: Context, val homeItems: List<HomeItems>?) : RecyclerView.Adapter<HomeItemChildAdapter.HomeItemChildViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeItemChildViewHolder {
        val inflater = LayoutInflater.from(context)
        val binding = DataBindingUtil.inflate<ListitemHomeAlignCategoryBinding>(inflater,R.layout.listitem_home_align_category,parent, false )
        binding.homeFavouriteCategoryImage.layoutParams.height = HOMEITEM_CHILD_SIZE
        binding.homeFavouriteCategoryImage.layoutParams.width = HOMEITEM_CHILD_SIZE
        binding.root.requestLayout()
        return HomeItemChildViewHolder(binding)
    }

    override fun getItemCount(): Int = homeItems?.size ?: 0

    override fun onBindViewHolder(holder: HomeItemChildViewHolder, position: Int) {
        holder.bind(homeItems?.get(position))
    }

    class HomeItemChildViewHolder(val binding: ListitemHomeAlignCategoryBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind( homeItem : HomeItems?){
            homeItem?.let {
            val (title, imageURL) = homeItem
            binding.homeFavouriteCategoryTitle.text = title
            Glide.with(binding.root)
                    .load(imageURL)
                    .apply { RequestOptions().override(HOMEITEM_CHILD_SIZE, HOMEITEM_CHILD_SIZE )}
                    .into(binding.homeFavouriteCategoryImage)
            }
        }
    }
}
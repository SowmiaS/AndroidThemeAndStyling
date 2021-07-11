package com.ss.mysmoothiesample

import android.content.Context
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ss.mysmoothiesample.databinding.FragmentHomeBinding
import com.ss.mysmoothiesample.home.HomeViewModelFactory
import com.ss.mysmoothiesample.home.adapter.HomeItemMainAdapter
import com.ss.mysmoothiesample.home.network.HomeItemRepository
import com.ss.mysmoothiesample.home.viewmodel.HomeViewModel


class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override var layout = R.layout.fragment_home

     lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this, HomeViewModelFactory(HomeItemRepository())).get(HomeViewModel::class.java)    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        observerHomeItems()
    }

    private fun observerHomeItems(){
        viewModel.homeItems.observe(viewLifecycleOwner, Observer {
            activity?.let { activity ->
                binding.homeMainRecyclerview.layoutManager = LinearLayoutManager(activity).apply { orientation = LinearLayoutManager.VERTICAL }
                binding.homeMainRecyclerview.adapter = HomeItemMainAdapter(activity, it)
                (binding.homeMainRecyclerview.adapter as HomeItemMainAdapter).notifyDataSetChanged()
            }

        })
    }

}
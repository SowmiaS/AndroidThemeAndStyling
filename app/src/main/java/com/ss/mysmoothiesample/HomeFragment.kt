package com.ss.mysmoothiesample

import android.content.Context
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ss.mysmoothiesample.databinding.FragmentHomeBinding
import com.ss.mysmoothiesample.home.adapter.HomeItemMainAdapter
import com.ss.mysmoothiesample.home.viewmodel.HomeViewModel


abstract class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override var layout = R.layout.fragment_home

     lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
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
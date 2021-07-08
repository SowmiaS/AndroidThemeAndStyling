package com.ss.mysmoothiesample.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ss.mysmoothiesample.home.HomeItemTypes
import com.ss.mysmoothiesample.home.HomeItems
import com.ss.mysmoothiesample.home.network.HomeItemRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomeViewModel(val repo : HomeItemRepository) : ViewModel(){

    private val _homeItems = MutableLiveData<Map<HomeItemTypes, List<HomeItems>>>()
    val homeItems : LiveData<Map<HomeItemTypes, List<HomeItems>>> = _homeItems

    init {
        fetchHomeItems()
    }

    private fun fetchHomeItems(){
        viewModelScope.launch(Dispatchers.Main) {
            withContext(Dispatchers.IO){
                _homeItems.value = repo.getHomeItems()
            }

        }
    }
}
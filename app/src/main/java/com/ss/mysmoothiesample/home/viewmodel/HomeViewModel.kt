package com.ss.mysmoothiesample.home.viewmodel

import androidx.lifecycle.*
import com.ss.mysmoothiesample.home.HomeItemTypes
import com.ss.mysmoothiesample.home.HomeItems
import com.ss.mysmoothiesample.home.network.HomeItemRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class HomeViewModel(val repo : HomeItemRepository) : ViewModel(){

    private val _homeItems = MutableLiveData<Map<HomeItemTypes, List<HomeItems>>>()
    val homeItems : LiveData<Map<HomeItemTypes, List<HomeItems>>> = Transformations.map(_homeItems) { it.mapValues { it.value.map { it.apply { it.title = "CHANGE" } } } }

    init {
        fetchHomeItems()
    }

    private fun fetchHomeItems(){
        viewModelScope.launch(Dispatchers.Main) {
             _homeItems.value = repo.getHomeItems()
        }
    }

    fun <X,Y> sampleMap(sourceLiveData : LiveData<X>, b: ()->Y) : LiveData<Y>{
        val result = MediatorLiveData<Y>()
        result.addSource(sourceLiveData){
            // what should we do when this changes
            result.value = b.invoke()
        }
        return result
    }

    fun <X,Y> dampleMap(source : LiveData<X>, b : (a : X) -> Y ): LiveData<Y>{
        val result = MediatorLiveData<Y>()
        result.addSource(source){
            result.value = b.invoke(it)
        }
        return result
    }

    fun <X,Y> dampleDistinctUntilChanged(source:LiveData<X>) : LiveData<X> {
        val result = MediatorLiveData<X>()
        result.addSource(source) {
            if (result.value != it) {
                result.value = it
            }
        }
        return result
    }


    fun <X,Y,Z> damplecombine(source1: LiveData<X>, source2: LiveData<Y>) : LiveData<Pair<X,Y>>{
        val result = MediatorLiveData<Pair<X,Y>>()

        fun combine(){
            val aValue = source1.value
            val bValue = source2.value

            if (aValue != null && bValue != null) {
                result.value = (Pair(aValue, bValue))
            }
        }

        result.addSource(source1) { combine()}
        result.addSource(source2) { combine()}

        return result
    }

    fun <X> filter(source : LiveData<X> , filter : (X) -> X) : LiveData<X>{
        val result = MediatorLiveData<X>()
        result.addSource(source){
            val res = filter.invoke(it)
            result.value = res
        }
        return result
    }



    fun test(){
        dampleMap(_homeItems){
            it.mapValues { it.value.map { it.apply { it.title = "CHANGE" } } }
        }
    }


}




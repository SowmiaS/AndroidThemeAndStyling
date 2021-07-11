package com.ss.mysmoothiesample.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ss.mysmoothiesample.home.network.HomeItemRepository
import com.ss.mysmoothiesample.login.viewmodel.repository.LoginRepository

class HomeViewModelFactory(val repo: HomeItemRepository) : ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(HomeItemRepository::class.java).newInstance(repo)
    }


}
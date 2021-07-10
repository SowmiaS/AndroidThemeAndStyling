package com.ss.mysmoothiesample.login.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ss.mysmoothiesample.login.viewmodel.repository.LoginRepository

class LoginViewModelFactory(val repo: LoginRepository) : ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(LoginRepository::class.java).newInstance(repo)
    }


}
package com.ss.mysmoothiesample.login.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ss.mysmoothiesample.login.viewmodel.repository.LoginRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel(val loginRepository: LoginRepository) : ViewModel() {

    val emailAddress  = MutableLiveData<String>()
    val password  = MutableLiveData<String>()

    val loginResponse = MutableLiveData<String>()

    fun login(){
      viewModelScope.launch(Dispatchers.Main) {
          val loginResponse = loginRepository.login(emailAddress.toString(), password.toString())
      }
    }
}
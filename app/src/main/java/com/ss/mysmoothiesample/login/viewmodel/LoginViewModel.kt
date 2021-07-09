package com.ss.mysmoothiesample.login.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    val emailAddress  = MutableLiveData<String>()
    val password  = MutableLiveData<String>()

}
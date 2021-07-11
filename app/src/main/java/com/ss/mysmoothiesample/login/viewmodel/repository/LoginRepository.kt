package com.ss.mysmoothiesample.login.viewmodel.repository

import com.ss.mysmoothiesample.base.network.LoginData
import com.ss.mysmoothiesample.base.network.LoginResponse

class LoginRepository {

    fun login(email: String, password: String) : LoginResponse{
        return LoginResponse(LoginData("Sowmia"))
    }

}
package com.ss.mysmoothiesample.base.network

data class BaseResponse(val responseTypes: ResponseTypes ){

}
enum class ResponseTypes(){
    ;
    enum class  Success{

    };
    enum class Error{
        NETWORKERROR
        ;
        enum class LoginError{
            INVALID_EMAILADDRESS, INVALID_PASSWORD, INVALID_BOTH
        };
    };
}

data class LoginResponse(val body: LoginData, val error : ResponseTypes.Error.LoginError? = null)
data class LoginData(val userName: String)
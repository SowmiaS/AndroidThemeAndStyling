package com.ss.mysmoothiesample.home.network

import com.ss.mysmoothiesample.home.HomeItems
import retrofit2.http.GET
import retrofit2.http.Path

interface HomeItemsService {

    @GET("home/homeitems")
    suspend fun listHomeItems(): List<HomeItems>?

}
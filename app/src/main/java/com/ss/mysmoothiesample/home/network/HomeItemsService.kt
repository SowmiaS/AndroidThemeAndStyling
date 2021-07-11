package com.ss.mysmoothiesample.home.network

import com.ss.mysmoothiesample.home.HomeItems
import com.ss.mysmoothiesample.home.HomeItemsData
import retrofit2.http.GET
import retrofit2.http.Path

interface HomeItemsService {

    @GET("gethomeitems.json")
    suspend fun listHomeItems(): HomeItemsData?

}
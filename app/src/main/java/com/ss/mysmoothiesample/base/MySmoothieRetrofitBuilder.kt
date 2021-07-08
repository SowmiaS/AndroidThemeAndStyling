package com.ss.mysmoothiesample.base

import com.ss.mysmoothiesample.home.network.HomeItemsService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val retrofit  = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

val  service = retrofit.create(HomeItemsService::class.java)


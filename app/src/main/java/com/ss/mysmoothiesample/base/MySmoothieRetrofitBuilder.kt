package com.ss.mysmoothiesample.base

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.ss.mysmoothiesample.home.network.HomeItemsService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


const val BASE_URL = "https://github.com/SowmiaS/AndroidThemeAndStyling/tree/develop/app/src/main/assets/"

var gson: Gson = GsonBuilder()
        .setLenient()
        .create()

val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

val  service: HomeItemsService = retrofit.create(HomeItemsService::class.java)


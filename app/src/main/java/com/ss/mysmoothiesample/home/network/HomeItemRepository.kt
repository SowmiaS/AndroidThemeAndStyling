package com.ss.mysmoothiesample.home.network

import com.ss.mysmoothiesample.base.retrofit
import com.ss.mysmoothiesample.base.service
import com.ss.mysmoothiesample.home.HomeItemTypes
import com.ss.mysmoothiesample.home.HomeItems

class HomeItemRepository {

    suspend fun getHomeItems() : Map<HomeItemTypes, List<HomeItems>>? {
         return service.listHomeItems()?.groupBy { it.type }
    }





}
package com.ss.mysmoothiesample.home.network

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.ss.mysmoothiesample.base.retrofit
import com.ss.mysmoothiesample.base.service
import com.ss.mysmoothiesample.home.HomeItemTypes
import com.ss.mysmoothiesample.home.HomeItems
import com.ss.mysmoothiesample.home.HomeItemsData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext

class HomeItemRepository {

    suspend fun getHomeItems(): Map<HomeItemTypes, List<HomeItems>>? {
            val homeItems =
                GsonBuilder().create()
                    .fromJson<HomeItemsData>(jsonString, HomeItemsData::class.java)
            println("${homeItems}")
            return homeItems.homeitems?.groupBy { it.type }
//         return service.listHomeItems()?.homeitems?.groupBy { it.type }
    }

}

    val jsonString = "{\n" +
            "  \"homeitems\":[\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\"type\": \"Favourite Collections\"},\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Favourite Collections\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Favourite Collections\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Favourite Collections\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Favourite Collections\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Favourite Collections\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Favourite Collections\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Favourite Collections\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Favourite Collections\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Favourite Collections\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Favourite Collections\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Favourite Collections\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Body\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Body\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Body\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Body\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Body\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Body\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Body\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Body\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Mind\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Mind\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Mind\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Mind\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Mind\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Mind\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Mind\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Mind\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Mind\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Mind\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"Short Mantras\",\n" +
            "    \"imageURL\": \"https://unsplash.com/photos/s5kTY-Ve1c0\",\n" +
            "    \"type\": \"Align Your Mind\"\n" +
            "  }\n" +
            "]\n" +
            "}\n"


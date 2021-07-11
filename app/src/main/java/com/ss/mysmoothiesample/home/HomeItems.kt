package com.ss.mysmoothiesample.home

import com.google.gson.annotations.SerializedName

data class HomeItemsData(val homeitems : List<HomeItems>)
data class HomeItems(var title: String, val imageURL : String, val type: HomeItemTypes ) {
}

data class HomeMainItems(val title: String, val children: List<HomeItems>?){

}

enum class HomeItemTypes(var type: String){

    @SerializedName("Favourite Collections")
    FavouriteCollections("Favourite Collections"),

    @SerializedName("Align Your Body")
    AlignYourBody("Align Your Body"),

    @SerializedName("Align Your Mind")
    AlignYourMind("Align Your Mind")
    ;

}


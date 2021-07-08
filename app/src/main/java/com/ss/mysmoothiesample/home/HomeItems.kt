package com.ss.mysmoothiesample.home

data class HomeItems(val title: String, val imageURL : String, val type: HomeItemTypes ) {
}

data class HomeMainItems(val title: String, val children: List<HomeItems>?){

}

enum class HomeItemTypes(val type: String){
    FavouriteCollections("Favourite Collections"),
    AlignYourBody("Align Your Body"),
    AlignYourMind("Align Your Mind")
}


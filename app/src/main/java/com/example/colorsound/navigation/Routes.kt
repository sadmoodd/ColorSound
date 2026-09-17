package com.example.colorsound.navigation

object Routes {
    const val LIVE = "live"
    const val LIBRARY = "library"
    const val GENERATOR = "generator"
    const val DETAIL = "detail/{portraitId}"

    // конкатенируем строки с айдишками
    fun detail(id: Long): String = "detail/$id"


}



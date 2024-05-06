package com.example.jetpackcompose.ui.theme.navigation

sealed class ScreenHolder(val route: String) {
    //each object represent one screen

    object HomeScreen : ScreenHolder(route = "home_screen")
    object DetailScreen :  ScreenHolder(route = "detail_screen")
}
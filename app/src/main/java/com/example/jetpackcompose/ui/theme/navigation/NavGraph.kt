package com.example.jetpackcompose.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetNavGraph(
    navController: NavHostController
) {

    NavHost(navController = navController, startDestination = ScreenHolder.HomeScreen.route) {
        composable(
            route = ScreenHolder.HomeScreen.route
        ){
            HomeScreen(navController)
        }
        composable(
            route = ScreenHolder.DetailScreen.route
        ){
            DetailScreen(navController)
        }
    }
}
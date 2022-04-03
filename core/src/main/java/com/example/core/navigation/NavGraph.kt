package com.example.core.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.core.constants.Route
import com.example.core.splash.AnimatedSplashScreen
import com.example.core.splash.MainScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Route.WELCOME
    ) {
        composable(route = Route.WELCOME) {
            AnimatedSplashScreen(navController)
        }
        composable(route = Route.ACTIVITY,) {
            MainScreen()
        }
    }
}
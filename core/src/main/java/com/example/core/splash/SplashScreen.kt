package com.example.core.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@Composable
fun AnimatedSplashScreen(navController: NavController) {
    Splash()
    LaunchedEffect(key1 = true ) {
        delay(3000L)
        navController.navigate("activity")
    }
}

@Composable
fun Splash() {
    Box(
        modifier = Modifier
            .background(if (isSystemInDarkTheme()) Color.DarkGray else Color.Gray)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(modifier = Modifier.size(120.dp),
            imageVector = Icons.Default.Star,
            contentDescription = "WarzoneStats",
            tint = Color.Black
        )
    }
}
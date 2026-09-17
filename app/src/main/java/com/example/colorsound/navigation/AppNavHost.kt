package com.example.colorsound.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.colorsound.generator.GeneratorScreen
import com.example.colorsound.library.LibraryScreen
import com.example.colorsound.live.LiveScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route

    Scaffold(
        bottomBar = {BottomBar(
            current = currentRoute,
            onNavigate = { route ->
                navController.navigate(route) {
                    popUpTo(navController.graph.startDestinationId) { saveState = true }
                    launchSingleTop = true
                    restoreState = true
                }
            }
        )}
    ) { padding ->
        NavHost(
            navController=navController,
            startDestination = Routes.LIVE,
            modifier= modifier.padding(padding)
        ) {
            composable(Routes.LIVE) { LiveScreen() }
            composable(Routes.LIBRARY) { LibraryScreen() }
            composable(Routes.GENERATOR) { GeneratorScreen() }

        }
    }


}
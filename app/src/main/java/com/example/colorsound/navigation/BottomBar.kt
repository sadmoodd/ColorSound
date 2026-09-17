package com.example.colorsound.navigation

import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.GeneratingTokens
import androidx.compose.material.icons.filled.LibraryBooks
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun BottomBar(
    current: String?,
    onNavigate: (String) -> Unit,
    modifier: Modifier = Modifier
){
    NavigationBar (modifier = modifier) {
        NavigationBarItem(
            selected = current == Routes.LIVE,
            onClick = { onNavigate(Routes.LIVE) },
            icon = { Icon(Icons.Default.Mic, null) },
            label = { Text("Микрофон") }
        )
        NavigationBarItem(
            selected = current == Routes.LIBRARY,
            onClick = { onNavigate(Routes.LIBRARY) },
            icon = { Icon(Icons.Default.LibraryBooks, null) },
            label = { Text("Библиотека") }
        )
        NavigationBarItem(
            selected = current == Routes.GENERATOR,
            onClick = { onNavigate(Routes.GENERATOR) },
            icon = { Icon(Icons.Default.GeneratingTokens, null) },
            label = { Text("Генератор") }
        )

    }
}
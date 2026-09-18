package com.example.colorsound.live

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.colorsound.navigation.Routes
import com.example.colorsound.ui.theme.MainColor

@Composable
fun LiveScreen(
    modifier: Modifier = Modifier,
){
    Box(modifier=modifier
        .fillMaxSize()
        .background(MainColor)
    ){

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LiveScreenPreview(modifier: Modifier = Modifier){
    LiveScreen()
}
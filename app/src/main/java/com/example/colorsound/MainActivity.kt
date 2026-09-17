package com.example.colorsound

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.colorsound.live.LiveScreen
import com.example.colorsound.navigation.AppNavHost
import com.example.colorsound.ui.theme.ColorSoundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColorSoundTheme {
                AppNavHost()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    MainScreenPreview()
}


@Composable
fun GreetingPreview() {
    ColorSoundTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun MainScreenPreview() {
    ColorSoundTheme {
        LiveScreen()
    }
}
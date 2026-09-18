package com.example.colorsound.generator

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.colorsound.ui.theme.MainColor
import com.example.colorsound.ui.theme.MainDimColor
import kotlin.math.roundToInt

@Composable
fun GeneratorScreen(modifier: Modifier= Modifier){
    val scrollState = rememberScrollState()
    Column(modifier = modifier
        .fillMaxSize()
        .verticalScroll(scrollState)
        .background(MainColor)
        .padding(8.dp)
    ){
        PreviewBox()
        ToolsRow()
        SliderBox()
        SaveButtonBox()
    }
}

@Composable
fun PreviewBox(modifier: Modifier = Modifier){
    Box(modifier=modifier
        .fillMaxWidth()
        .padding(8.dp)
        .background(Color.LightGray)
        .aspectRatio(9f / 16f)
        .border(width = 5.dp, color= Color.Gray)
    ) {
        Text("Здесь будет превью обоев", modifier= Modifier.align(Alignment.Center))
    }

}

@Composable
fun ToolsRow(modifier: Modifier = Modifier ){
        LazyRow(modifier=modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(MainDimColor),
            contentPadding = PaddingValues(horizontal = 18.dp, vertical = 5.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Button(onClick = { /* TODO */ }) {
                Text("Фильтр 1")
            }
        }

        item {
            Button(onClick = { /* TODO */ }) {
                Text("Фильтр 2")
            }
        }

        item {
            Button(onClick = { /* TODO */ }) {
                Text("Фильтр 3")
            }
        }
    }
}

@Composable
fun SliderBox(modifier: Modifier=Modifier ){
    var brightnessSliderPosition by remember { mutableStateOf(1f) }
    var contrastSliderPosition by remember { mutableStateOf(1f) }

    Column(modifier=modifier
        .padding(8.dp)
        .background(MainDimColor)
        .padding(8.dp)
    ) {
        Text("Яркость ${brightnessSliderPosition}")
        Slider(
            value = brightnessSliderPosition,
            onValueChange = { brightnessSliderPosition = it },
            valueRange = 0.5f..1.5f,
            steps = 3
        )


        Text("Контрастность ${contrastSliderPosition}")
        Slider(
            value = contrastSliderPosition,
            onValueChange = { contrastSliderPosition = it },
            valueRange = 0.5f..2.0f,
            steps = 5
        )
    }
}

@Composable
fun SaveButtonBox(modifier: Modifier= Modifier){
    Row(modifier=modifier
        .fillMaxWidth()
        .padding(8.dp),

        horizontalArrangement = Arrangement.spacedBy(8.dp)


    ) {
        Button(onClick = { /* TODO */ }) {
            Text("Сохранить в галерею")
        }
        Button(onClick = { /* TODO */ }) {
            Text("Установить обои")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun GenScreenPreview() {
    GeneratorScreen()
}
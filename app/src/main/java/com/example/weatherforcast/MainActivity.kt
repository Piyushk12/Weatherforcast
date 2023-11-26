package com.example.weatherforcast

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.weatherforcast.navigation.WeatherNavigation
import com.example.weatherforcast.ui.theme.WeatherforcastTheme
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalComposeUiApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContent {
                WeatherApp()

            }
        }
    }
}

@ExperimentalComposeUiApi
@Composable
fun WeatherApp() {

    WeatherforcastTheme{
        Surface(color = MaterialTheme.colorScheme.background,
            modifier = Modifier.fillMaxSize()) {
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                WeatherNavigation()

            }

        }

    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeatherforcastTheme {

    }
}
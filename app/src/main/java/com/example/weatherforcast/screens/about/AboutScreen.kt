package com.example.weatherforcast.screens.about

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.weatherforcast.widgets.WeatherAppBar


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavController) {
    Scaffold(topBar = {

        WeatherAppBar(
            title = "About",
            icon = Icons.Default.ArrowBack,
            false,
            navController = navController){
            navController.popBackStack()
        }
    }) {




    }

}
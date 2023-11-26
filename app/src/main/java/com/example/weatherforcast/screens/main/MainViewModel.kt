package com.bawp.weatherforecast.screens.main

import androidx.lifecycle.ViewModel
import com.example.weatherforcast.data.DataOrException
import com.example.weatherforcast.model.Weather
import com.example.weatherforcast.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: WeatherRepository)
    : ViewModel(){

        suspend fun getWeatherData(city: String, units: String)
        : DataOrException<Weather, Boolean, Exception> {
            return repository.getWeather(cityQuery = city, units = units)

        }




}
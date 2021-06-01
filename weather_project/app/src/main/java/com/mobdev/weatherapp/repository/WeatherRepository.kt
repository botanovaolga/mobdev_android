package com.mobdev.weatherapp.repository

import com.mobdev.weatherapp.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: ApiService) {
    suspend fun getWeather() = apiService.getWeather()
}
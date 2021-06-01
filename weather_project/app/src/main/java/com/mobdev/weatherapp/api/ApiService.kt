package com.mobdev.weatherapp.api

import com.mobdev.weatherapp.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/Moscow")
    suspend fun getWeather(): Response<Weather>

}
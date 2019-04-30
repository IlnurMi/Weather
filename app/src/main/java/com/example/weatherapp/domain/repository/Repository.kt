package com.example.weatherapp.domain.repository

import com.example.weatherapp.domain.models.City
import retrofit2.Call

interface Repository {
    fun getWeather(nameCity: String): Call<City>
}
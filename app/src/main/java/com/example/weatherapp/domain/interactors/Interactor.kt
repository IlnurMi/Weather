package com.example.weatherapp.domain.interactors

import com.example.weatherapp.domain.models.City
import com.example.weatherapp.domain.models.CityView
import retrofit2.Call

interface Interactor {
    fun getCityModel(nameCity: String): Call<City>
}
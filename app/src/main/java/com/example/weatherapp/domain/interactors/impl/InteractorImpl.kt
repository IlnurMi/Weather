package com.example.weatherapp.domain.interactors.impl

import com.example.weatherapp.domain.interactors.Interactor
import com.example.weatherapp.domain.models.City
import com.example.weatherapp.domain.models.CityView
import com.example.weatherapp.domain.repository.Repository
import retrofit2.Call

class InteractorImpl(val repository: Repository): Interactor {
    override fun getCityModel(nameCity: String): Call<City> {
        return repository.getWeather(nameCity)
    }
}
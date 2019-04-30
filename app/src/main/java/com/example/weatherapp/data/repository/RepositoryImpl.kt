package com.example.weatherapp.data.repository

import com.example.weatherapp.data.Api
import com.example.weatherapp.domain.models.City
import com.example.weatherapp.domain.repository.Repository
import retrofit2.Call

class RepositoryImpl(val client: Api): Repository {

    override fun getWeather(nameCity: String): Call<City> {
        return client.getCityDate(nameCity,"metric" ,"fd6364786de34099eb9ee2121b1e39c1")
    }

}
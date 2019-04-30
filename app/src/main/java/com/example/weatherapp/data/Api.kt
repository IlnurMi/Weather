package com.example.weatherapp.data

import com.example.weatherapp.domain.models.City
import com.example.weatherapp.domain.models.CityList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("weather")
    fun getCityDate(
        @Query("q") name: String,
        @Query("units") units: String,
        @Query("APPID") appid: String
    ): Call<City>

    @GET("forecast")
    fun getCityListDate(
        @Query("q") name: String,
        @Query("units") units: String,
        @Query("APPID") appid: String
    ): Call<CityList>
}
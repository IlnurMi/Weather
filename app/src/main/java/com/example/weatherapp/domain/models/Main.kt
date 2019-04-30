package com.example.weatherapp.domain.models

import com.google.gson.annotations.SerializedName

class Main(
    @SerializedName("temp")
    val temp: Float,
    val pressure: Float,
    val humidity: Float,
    @SerializedName("temp_min")
    val minTemp: Float,
    @SerializedName("temp_max")
    val maxTemp: Float)

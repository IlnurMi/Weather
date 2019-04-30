package com.example.weatherapp.domain.models

import com.google.gson.annotations.SerializedName

class Wind(
    @SerializedName("speed")
    val speed: Float,
    @SerializedName("deg")
    val degree: Float)
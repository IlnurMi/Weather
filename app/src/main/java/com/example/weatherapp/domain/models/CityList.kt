package com.example.weatherapp.domain.models

import com.google.gson.annotations.SerializedName

class CityList(
    @SerializedName("list")
    val items: List<City>)
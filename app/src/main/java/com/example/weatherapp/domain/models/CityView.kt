package com.example.weatherapp.domain.models

import com.example.weatherapp.presentation.presenters.MainPresenter

class CityView(
    var cityName: String,
    var temp: String,
    val windSpeed: String,
    val humidity: String,
    val minTemp: String,
    val maxTemp: String,
    val pressure: String)
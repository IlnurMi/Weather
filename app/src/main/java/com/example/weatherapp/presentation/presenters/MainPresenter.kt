package com.example.weatherapp.presentation.presenters

import com.example.weatherapp.domain.models.CityView

interface MainPresenter {

    fun getDate(nameCity: String)

    interface View{
        fun showCityDate(cityModel: CityView)
    }
}
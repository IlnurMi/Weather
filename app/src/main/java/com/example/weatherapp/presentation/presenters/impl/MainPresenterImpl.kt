package com.example.weatherapp.presentation.presenters.impl

import com.example.weatherapp.domain.interactors.Interactor
import com.example.weatherapp.domain.models.CityView
import com.example.weatherapp.presentation.presenters.MainPresenter
import com.example.weatherapp.presentation.ui.MainActivity

class MainPresenterImpl(val interactor: Interactor, val mainActivity: MainActivity): MainPresenter {
    val cityModel: CityView? = null
    override fun getDate(nameCity: String){
        val answer = interactor.getCityModel(nameCity)
        if(answer.isExecuted){
            val city = answer.execute().body()
            cityModel!!.cityName = city?.cityName.toString()
            cityModel.temp = city?.main!!.temp.toString()
        }
        if (cityModel != null) {
            mainActivity.showCityDate(cityModel)
        }
    }
}
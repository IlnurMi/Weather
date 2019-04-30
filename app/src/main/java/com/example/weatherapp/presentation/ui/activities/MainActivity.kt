package com.example.weatherapp.presentation.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.weatherapp.R
import com.example.weatherapp.domain.interactors.Interactor
import com.example.weatherapp.domain.models.CityView
import com.example.weatherapp.presentation.presenters.MainPresenter
import com.example.weatherapp.presentation.presenters.impl.MainPresenterImpl

class MainActivity : AppCompatActivity(),MainPresenter.View {

    lateinit var mainPresenter: MainPresenter
    lateinit var interactor: Interactor
    lateinit var mCityTextView: TextView
    lateinit var mTempTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mCityTextView = findViewById(R.id.city_textview)
        mTempTextView = findViewById(R.id.temp_textview)

        mainPresenter = MainPresenterImpl(interactor,this )
        mainPresenter.getDate("Kazan")
    }

    override fun showCityDate(cityModel: CityView) {
        mCityTextView.text = cityModel.cityName
        mTempTextView.text = cityModel.temp
    }

}

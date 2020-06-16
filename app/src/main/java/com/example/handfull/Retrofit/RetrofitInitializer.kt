package com.example.handfull.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {
    fun init(){
        Retrofit.Builder()
            .baseUrl("https://handfull.herokuapp.com/api")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
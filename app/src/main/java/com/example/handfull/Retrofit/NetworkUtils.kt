package com.example.handfull.Retrofit

import com.example.handfull.Retrofit.Services.Endpoint
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class NetworkUtils {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://handfull.herokuapp.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun lancheList() = retrofit.create(Endpoint::class.java)
    fun cadastro() = retrofit.create(Endpoint::class.java)
    fun login() = retrofit.create(Endpoint::class.java)
    fun pagamento() = retrofit.create(Endpoint::class.java)

}
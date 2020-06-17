package com.example.handfull.Retrofit.Services

import com.example.handfull.Model.Lanches
import com.example.handfull.Model.Sucos
import retrofit2.Call
import retrofit2.http.GET

interface Endpoint {

    @GET("listar-lanches")
    fun getLanches() : Call<List<Lanches>>

    @GET("listar-sucos")
    fun getSucos() : Call<List<Sucos>>
}
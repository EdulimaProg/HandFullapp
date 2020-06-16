package com.example.handfull.Retrofit.services

import com.example.handfull.model.Lanche
import retrofit2.Call
import retrofit2.http.GET

interface Lanches {
        @GET("listar-lanches")
        fun lanches() : Call<List<Lanche>>
    }

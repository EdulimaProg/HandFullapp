package com.example.handfull.Retrofit.Services

import com.example.handfull.Model.Lanches
import com.example.handfull.Model.Sucos
import com.example.handfull.Model.Usuario
import com.example.handfull.Model.UsuarioLogin
import retrofit2.Call
import retrofit2.http.*

interface Endpoint {

    @GET("listar-lanches")
    fun getLanches() : Call<List<Lanches>>

    @GET("promo")
    fun getSucos() : Call<List<Sucos>>



    @POST("cadastro/usuario")
    fun cadastro(@Body usuario: Usuario) : Call<Usuario>

    @POST("login")
    fun login(@Body usuariologin: UsuarioLogin) : Call<UsuarioLogin>
}
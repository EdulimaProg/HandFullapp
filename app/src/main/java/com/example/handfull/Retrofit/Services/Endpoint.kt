package com.example.handfull.Retrofit.Services

import com.example.handfull.Model.*
import retrofit2.Call
import retrofit2.http.*

interface Endpoint {
    //endpoits da aplicação
    @GET("listar-lanches")
    fun getLanches() : Call<List<Lanches>>

    @GET("promo")
    fun getSucos() : Call<List<Sucos>>

    @POST("cadastro/usuario")
    fun cadastro(@Body usuario: Usuario) : Call<Usuario>

    @POST("pagamento")
    fun pagamento(@Body pagamento: Pagamento) : Call<Pagamento>

    @POST("login")
    fun login(@Body usuariologin: UsuarioLogin) : Call<UsuarioLogin>
}
package com.example.handfull

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.handfull.Model.Lanches
import com.example.handfull.Model.Sucos
import com.example.handfull.Retrofit.NetworkUtils
import com.example.handfull.Retrofit.Services.Endpoint
import kotlinx.android.synthetic.main.activity_drinks.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Drinks: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_drinks));

        getdata()
    }

    fun getdata(){
        val retrofitClient = NetworkUtils.getRetrofitInstance("https://handfull.herokuapp.com/api/")

        val endpoint = retrofitClient.create(Endpoint::class.java)
        val callback = endpoint.getSucos()

        callback.enqueue(object : Callback<List<Sucos>> {
            override fun onFailure(call: Call<List<Sucos>>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<List<Sucos>>, response: Response<List<Sucos>>) {
                response.body()?.forEach {
                    listarsuco.text = listarsuco.text.toString().plus(it.nome)
                }
            }
        })
    }
}
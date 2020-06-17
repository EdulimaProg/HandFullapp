package com.example.handfull

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.handfull.Model.Lanches
import com.example.handfull.Retrofit.NetworkUtils
import com.example.handfull.Retrofit.Services.Endpoint
import kotlinx.android.synthetic.main.activity_foods.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Foods: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_foods));

    getdata();
    }

    fun getdata(){
        val retrofitClient = NetworkUtils.getRetrofitInstance("https://handfull.herokuapp.com/api/")

        val endpoint = retrofitClient.create(Endpoint::class.java)
        val callback = endpoint.getLanches()

        callback.enqueue(object : Callback<List<Lanches>>{
            override fun onFailure(call: Call<List<Lanches>>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<List<Lanches>>, response: Response<List<Lanches>>) {
                response.body()?.forEach {
                    listalanche.text = listalanche.text.toString().plus(it.nome)
                }
            }
        })
    }
}
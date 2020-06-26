package com.example.handfull

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.handfull.Model.Lanches
import com.example.handfull.Model.Sucos
import com.example.handfull.Retrofit.NetworkUtils
import com.example.handfull.Retrofit.Services.Endpoint
import com.example.handfull.adapter.LancheListAdpter
import com.example.handfull.adapter.SucosLancheAdapter
import kotlinx.android.synthetic.main.activity_drinks.*
import kotlinx.android.synthetic.main.activity_foods.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.Serializable

class Drinks: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);


        setContentView((R.layout.activity_drinks));
        val call = NetworkUtils().lancheList().getSucos()


        call.enqueue(object : Callback<List<Sucos>?>{
            override fun onFailure(call: Call<List<Sucos>?>, t: Throwable) {
                TODO("Not yet implemented por enquanto")
            }

            override fun onResponse(
                call: Call<List<Sucos>?>,
                response: Response<List<Sucos>?>
            ) {
                response?.body()?.let {
                    val sucos : List<Sucos> = it
                    configureList(sucos)
                }
            }

        })
    }
    private fun configureList(lanches : List<Sucos>){
        val recyclerView = sucos_list_recicleview
        recyclerView.adapter = SucosLancheAdapter(lanches, this)
        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager

    }








}
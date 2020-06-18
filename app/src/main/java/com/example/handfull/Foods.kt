package com.example.handfull

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.handfull.Model.Lanches
import com.example.handfull.Retrofit.NetworkUtils
import com.example.handfull.Retrofit.Services.Endpoint
import com.example.handfull.adapter.LancheListAdpter
import kotlinx.android.synthetic.main.activity_foods.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Foods: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_foods));

        val call = NetworkUtils().lancheList().getLanches()
        call.enqueue(object : Callback<List<Lanches>?>{
            override fun onFailure(call: Call<List<Lanches>?>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(
                call: Call<List<Lanches>?>,
                response: Response<List<Lanches>?>
            ) {
                response?.body()?.let {
                    val lanches : List<Lanches> = it
                    configureList(lanches)
                }
            }

        })
    }
    private fun configureList(lanches : List<Lanches>){
        val recyclerView = lista_lanche_recicleview
        recyclerView.adapter = LancheListAdpter(lanches, this)
        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager

    }


}
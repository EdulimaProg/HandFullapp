package com.example.handfull

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.handfull.Retrofit.RetrofitInitializer
import kotlinx.android.synthetic.main.activity_foods.*

class Foods: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_foods));

        RetrofitInitializer()

        val recyclerView = lista_lanche
        recyclerView.adapter =
    }

}
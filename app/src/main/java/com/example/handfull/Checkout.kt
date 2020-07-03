package com.example.handfull

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_checkout.*
import java.util.ResourceBundle.getBundle

class Checkout:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_checkout));

        print(getIntent().getBundleExtra("nome_item"));



    }
}
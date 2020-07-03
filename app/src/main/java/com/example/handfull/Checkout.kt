package com.example.handfull

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_checkout.*
import java.util.ResourceBundle.getBundle

class Checkout:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_checkout));


        var nomeItem = intent.getStringExtra("nome_item")
        var valorItem = intent.getStringExtra("valor_item")
        //print(getIntent().getBundleExtra("item"));


        nome_item.text = nomeItem
        valor_item.text = valorItem
    }
}
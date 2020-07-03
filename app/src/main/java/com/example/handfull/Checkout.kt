package com.example.handfull

import android.content.Intent
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


        println(valorItem)

        nome_item.text = nomeItem
        valor_item.text = valorItem

        button_pagamento.setOnClickListener(){

            val intent = Intent(this, Pagamento::class.java)

            var pedido = (10000000..99999999).random();

            println(pedido)

            intent.putExtra("num_pedido", pedido.toString())
            intent.putExtra("valor_item_topag", valorItem)

            startActivity(intent)

        }
    }
}
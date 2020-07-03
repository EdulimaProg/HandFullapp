package com.example.handfull

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_code.*

class Code:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_code));

        var numeropedido = intent.getStringExtra("num_pedido_aceito")

        codigo_pedido.text = numeropedido
    }
}
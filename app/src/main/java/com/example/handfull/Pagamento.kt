package com.example.handfull

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.carrinho_layout.*

class Pagamento:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.carrinho_layout));

        var numeropedido = intent.getStringExtra("num_pedido")
        var valorItem = intent.getStringExtra("valor_item_topag")

        println(numeropedido)

        teste_valor.text = valorItem
        numero_pedido.text = numeropedido

        confirm_button.setOnClickListener(){
            val intent = Intent(this, Code::class.java)

            intent.putExtra("num_pedido_aceito", numeropedido)

            startActivity(intent)
        }

    }
}
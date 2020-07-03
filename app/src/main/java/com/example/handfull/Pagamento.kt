package com.example.handfull

import android.content.Intent
import android.net.Network
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.handfull.Model.Pagamento
import com.example.handfull.Retrofit.NetworkUtils
import kotlinx.android.synthetic.main.carrinho_layout.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Pagamento:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.carrinho_layout));

        var numeropedido = intent.getStringExtra("num_pedido")
        var valorItem = intent.getStringExtra("valor_item_topag")

        println(numeropedido)

        teste_valor.text = valorItem
        numero_pedido.text = numeropedido

        var pagamento = Pagamento('1'.toString(),numeropedido,"00000000000",valorItem,numero_cartao.toString(),bandeira.toString(),nome_cartao.toString(),"05","1993","321")

        var call = NetworkUtils().pagamento().pagamento(pagamento)

        confirm_button.setOnClickListener(){
            val intent = Intent(this, Code::class.java)

            var pagamento = Pagamento('1'.toString(),numeropedido,"00000000000",valorItem,numero_cartao.toString(),bandeira.toString(),nome_cartao.toString(),"05","1993","321")

            var call = NetworkUtils().pagamento().pagamento(pagamento)

            call.enqueue(object: Callback<Pagamento> {
                override fun onFailure(call: Call<Pagamento>, t: Throwable) {
                    TODO("Not yet implemented")
                }

                override fun onResponse(call: Call<Pagamento>, response: Response<Pagamento>) {

                    intent.putExtra("num_pedido_aceito", numeropedido)

                    startActivity(intent)
                }

            })


        }

    }
}
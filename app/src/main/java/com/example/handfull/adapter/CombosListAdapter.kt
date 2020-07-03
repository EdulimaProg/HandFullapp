package com.example.handfull.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.handfull.Checkout
import com.example.handfull.Model.Combos
import com.example.handfull.R
import kotlinx.android.synthetic.main.lista_lanche.view.*

//model para a listagem de combos
class CombosListAdapter (private val listas: List<Combos>,
                        private val context: Context) : Adapter<CombosListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CombosListAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.lista_lanche, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listas.size
    }

    override fun onBindViewHolder(holder: CombosListAdapter.ViewHolder, position: Int) {
        val list = listas[position]
        holder?.let {
            it.bindView(list)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindView(Combos : Combos) {
            
            // variaveis que pegam os item da activity
            val nome = itemView.nome
            val preco = itemView.preco
            val descricao = itemView.descricao
            val add_cart = itemView.add_cart


            //variaveis que setam o valor nos itens da activities
            nome.text = Combos.nome
            preco.text = Combos.valor
            descricao.text = Combos.desc

            //botão de ação para o carrinho
            add_cart.setOnClickListener {

                val intent = Intent(itemView.context, Checkout::class.java)

                intent.putExtra("nome_item", Combos.nome)
                intent.putExtra("valor_item", Combos.valor)

                itemView.context.startActivity(intent)
            }
        }
    }
}
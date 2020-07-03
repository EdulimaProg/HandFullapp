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
import com.example.handfull.Model.Item
import com.example.handfull.R
import kotlinx.android.synthetic.main.lista_lanche.view.*


class ItemAdpter (private val listas: List<Item>,
                         private val context: Context) : Adapter<ItemAdpter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdpter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.carrinho_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listas.size
    }

    override fun onBindViewHolder(holder: ItemAdpter.ViewHolder, position: Int) {
        val list = listas[position]
        holder?.let {
            it.bindView(list)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindView(item : Item) {
            val nome = itemView.nome
            val preco = itemView.preco
            val descricao = itemView.descricao
            val add_cart = itemView.add_cart


            nome.text = item.nome
            preco.text = item.valor
            descricao.text = item.desc

            add_cart.setOnClickListener {

                val intent = Intent(itemView.context, Checkout::class.java)

                intent.putExtra("nome_item", item.nome)
                intent.putExtra("valor_item", item.valor)

                itemView.context.startActivity(intent)
            }
        }
    }
}
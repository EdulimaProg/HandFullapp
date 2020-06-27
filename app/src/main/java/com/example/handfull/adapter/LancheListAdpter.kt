package com.example.handfull.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.handfull.Checkout
import com.example.handfull.Model.Lanches
import com.example.handfull.R
import kotlinx.android.synthetic.main.lista_lanche.view.*

class LancheListAdpter (private val listas: List<Lanches>,
                        private val context: Context) : Adapter<LancheListAdpter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LancheListAdpter.ViewHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.lista_lanche, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listas.size
    }

    override fun onBindViewHolder(holder: LancheListAdpter.ViewHolder, position: Int) {
        val list = listas[position]
        holder?.let {
            it.bindView(list)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindView(lanche : Lanches) {
            val nome = itemView.nome
            val preco = itemView.preco
            val descricao = itemView.descricao
            val add_cart = itemView.add_cart

            nome.text = lanche.nome
            preco.text = lanche.valor
            descricao.text = lanche.desc


                 add_cart.setOnClickListener {
                    val bundle = Bundle()
                    bundle.putString("Nome item", lanche.nome)
                    bundle.putString("Valor ", lanche.valor)
                    val intent = Intent(itemView.context, Checkout::class.java)
                    intent.putExtras(bundle)
                    itemView.context.startActivity(intent)
                }
            }

        }
}

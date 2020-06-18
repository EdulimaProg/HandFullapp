package com.example.handfull.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.handfull.Model.Sucos
import com.example.handfull.R
import kotlinx.android.synthetic.main.lista_lanche.view.*

class SucosLancheAdapter (private val listas: List<Sucos>,
                        private val context: Context) : Adapter<SucosLancheAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SucosLancheAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.lista_lanche, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listas.size
    }

    override fun onBindViewHolder(holder: SucosLancheAdapter.ViewHolder, position: Int) {
        val list = listas[position]
        holder?.let {
            it.bindView(list)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindView(lanche : Sucos) {
            val nome = itemView.nome
            val preco = itemView.preco
            val descricao = itemView.descricao

            nome.text = lanche.nome
            preco.text = lanche.valor
            descricao.text = lanche.desc
        }
    }
}
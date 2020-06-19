package com.example.handfull.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.handfull.Model.Combos
import com.example.handfull.R
import kotlinx.android.synthetic.main.lista_lanche.view.*

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
            val nome = itemView.nome
            val preco = itemView.preco
            val descricao = itemView.descricao

            nome.text = Combos.nome
            preco.text = Combos.valor
            descricao.text = Combos.desc
        }
    }
}
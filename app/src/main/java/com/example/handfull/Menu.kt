package com.example.handfull

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Menu:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        fun OpenLanche(){
            val intent = Intent(this, Foods::class.java);
            startActivity(intent);
        }
        fun OpenSuco(){
            val intent = Intent(this, Drinks::class.java);
            startActivity(intent);
        }

        val lanches = findViewById<CardView>(R.id.card_view_lanches)
        val suco = findViewById<CardView>(R.id.card_view_sucos)

        lanches.setOnClickListener{
            OpenLanche()
        }

        suco.setOnClickListener{
            OpenSuco()
        }
    }
}
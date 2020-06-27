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


        fun OpenLanche() {
            val intent = Intent(this, Foods::class.java);
            startActivity(intent);
        }

        fun OpenPromo() {
            val intent = Intent(this, Drinks::class.java);
            startActivity(intent);
        }
        fun openCart() {
            val intent = Intent(this, Checkout::class.java);
            startActivity(intent);
        }
        fun openCode() {
            val intent = Intent(this, Code::class.java);
            startActivity(intent);
        }

        fun OpenCombos() {
            val intent = Intent(this, Drinks::class.java);
            startActivity(intent);
        }

        val promo = findViewById<CardView>(R.id.card_view_promo)
        val combos = findViewById<CardView>(R.id.card_view_combos)
        val cart = findViewById<Button>(R.id.carrinho)
        val code = findViewById<Button>(R.id.code)

        combos.setOnClickListener {
            OpenLanche()
        }
        promo.setOnClickListener {
            OpenPromo()
        }
        cart.setOnClickListener{
            openCart()
        }
        code.setOnClickListener{
            openCode()
        }

        }
}



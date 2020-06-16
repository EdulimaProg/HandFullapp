package com.example.handfull

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Menu:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        fun OpenMenu(){
            val intent = Intent(this, Foods::class.java);
            startActivity(intent);
        }

        val lanches = findViewById<ImageView>(R.id.click_salgados)

        lanches.setOnClickListener{
            OpenMenu()
        }

    }
}
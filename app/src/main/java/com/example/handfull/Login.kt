package com.example.handfull


import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent


class Login: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_login));

        fun OpenSignUp(){
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)

        }
        val cadastrar = findViewById<Button>(R.id.cadastrar)

        cadastrar.setOnClickListener{OpenSignUp()}


        fun OpenMenu(){
            val intent = Intent(this, Menu::class.java);
            startActivity(intent);
        }

        val login = findViewById<Button>(R.id.login)

        login?.setOnClickListener(){
            OpenMenu()
        }
    }
}
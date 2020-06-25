package com.example.handfull

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_login.*
import android.widget.Button as Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        fun OpenSignUp(){
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)

        }
        val cadastrar = findViewById<TextView>(R.id.cadastrar)

        cadastrar.setOnClickListener{
            OpenSignUp()
        }

        val login = findViewById<Button>(R.id.login)

        fun OpenMenu(){
            val intent = Intent(this, Menu::class.java);
            startActivity(intent);
        }

        login?.setOnClickListener(){
            OpenMenu()
        }
    }


}

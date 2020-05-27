package com.example.handfull

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class Login: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_login));

        fun OpenSignUp(){
            val intent = Intent(this, SignUp::class.java);
            startActivity(intent);
        }

        se_cadastrar.setOnClickListener{OpenSignUp()}


        fun OpenMenu(){
            val intent = Intent(this, Menu::class.java);
            startActivity(intent);
        }

        login.setOnClickListener{OpenMenu()}
    }
}
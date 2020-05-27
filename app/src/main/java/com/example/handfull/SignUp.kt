package com.example.handfull

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SignUp: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_signup));

    }

    private fun OpenCadastrar(){
        val intent = Intent(this, Login::class.java);
        startActivity(intent);
    }

}
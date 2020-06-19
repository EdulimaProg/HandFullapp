package com.example.handfull


import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.EditText
import android.widget.Toast
import com.example.handfull.Model.Usuario
import com.example.handfull.Model.UsuarioLogin
import com.example.handfull.Retrofit.NetworkUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Login: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_login));


        val email = findViewById<EditText>(R.id.email_user)
        val senha = findViewById<EditText>(R.id.senha_user)

        val usuarioLogin = UsuarioLogin(email.text.toString(),senha.text.toString())



        val call = NetworkUtils().cadastro().login(usuarioLogin)

        call.enqueue(object: Callback<UsuarioLogin> {
            override fun onFailure(call: Call<UsuarioLogin>, t: Throwable) {
                TODO("Not yet implemented")
            }
            override fun onResponse(call: Call<UsuarioLogin>, response: Response<UsuarioLogin>) {
                print(response.message())
                Toast.makeText(applicationContext,response.message(), Toast.LENGTH_LONG).show()
                OpenMenu()
            }
        })


    }
        fun OpenSignUp(){
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)

        }

        fun OpenMenu(){
            val intent = Intent(this, Menu::class.java);
            startActivity(intent);
        }
}
package com.example.handfull

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.handfull.Model.Usuario
import com.example.handfull.Retrofit.NetworkUtils
import kotlinx.android.synthetic.main.activity_signup.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUp: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_signup));

        val cadastro = findViewById<Button>(R.id.cadastrar_usuario)

        fun BackLogin(){
            val intent = Intent(this, Login::class.java);
            startActivity(intent);
        }

        cadastro.setOnClickListener{

           val nome = findViewById<EditText>(R.id.nome_user)
           val cpf = findViewById<EditText>(R.id.cpf_user)
           val email = findViewById<EditText>(R.id.email_user)
           val senha = findViewById<EditText>(R.id.senha_user)

            println(nome.text.toString())
            val usuario = Usuario(nome.text.toString(),cpf.text.toString(),email.text.toString(),senha.text.toString())



            val call = NetworkUtils().cadastro().cadastro(usuario)

            call.enqueue(object: Callback<Usuario>{
                override fun onFailure(call: Call<Usuario>, t: Throwable) {
                    TODO("Not yet implemented")
                }
                override fun onResponse(call: Call<Usuario>, response: Response<Usuario>) {
                    Toast.makeText(applicationContext,response.message(), Toast.LENGTH_LONG).show()
                    BackLogin()
                }

            })

        }


    }

    private fun OpenCadastrar(){
        val intent = Intent(this, Login::class.java);
        startActivity(intent);
    }

}
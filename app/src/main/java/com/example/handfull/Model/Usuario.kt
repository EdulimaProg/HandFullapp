package com.example.handfull.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

//seriazable para cadastro de usuario
class Usuario(var nome : String,var cpf : String,var email : String, var senha : String) : Serializable
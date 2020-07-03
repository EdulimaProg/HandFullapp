package com.example.handfull.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

//seriazable para cadastro de usuario
class Pagamento(
    var id : String,
    var numero_pedido  : String,
    var cpf : String,
    var valor : String,
    var number : String,
    var brand : String,
    var cardholder_name : String,
    var expiration_month : String,
    var expiration_year : String,
    var security_code : String

) : Serializable
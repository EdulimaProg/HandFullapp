package com.example.handfull.Model

import com.google.gson.annotations.SerializedName
// model para a listagem de lanches
data class Lanches(
    @SerializedName("nome")
    var nome : String,
    @SerializedName("valor")
    var valor : String,
    @SerializedName("desc")
    var desc : String
)
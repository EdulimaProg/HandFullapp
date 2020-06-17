package com.example.handfull.Model

import com.google.gson.annotations.SerializedName

data class Sucos(
    @SerializedName("nome")
    var nome : String,
    @SerializedName("userId")
    var valor : Double,
    @SerializedName("id")
    var desc : String
)
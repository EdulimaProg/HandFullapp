package com.example.handfull.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Sucos(
    @SerializedName("nome")
    var nome : String,
    @SerializedName("valor")
    var valor : String,
    @SerializedName("desc")
    var desc : String
) : Serializable

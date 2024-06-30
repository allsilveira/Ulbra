package com.example.avaliacao_semestral.data.network.responses

import com.google.gson.annotations.SerializedName

data class Results(
    @SerializedName("results")
    val characters: List<Character>
)

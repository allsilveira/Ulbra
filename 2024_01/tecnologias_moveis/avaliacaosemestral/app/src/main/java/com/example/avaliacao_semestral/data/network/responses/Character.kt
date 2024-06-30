package com.example.avaliacao_semestral.data.network.responses

import com.example.avaliacao_semestral.data.CharacterModel
import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("species")
    val species: String

)

fun Character.toModel() = CharacterModel(this.name, this.image, this.species)
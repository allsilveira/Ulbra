package com.example.avaliacao_semestral.presentation.adapters

fun String.characterSpecieTranslate(): String {
    return when (this.toLowerCase()) {
        "human" -> "Humano"
        "alien" -> "Alienígena"
        else -> this
    }
}
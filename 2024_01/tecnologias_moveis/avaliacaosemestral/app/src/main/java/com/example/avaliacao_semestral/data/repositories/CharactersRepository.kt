package com.example.avaliacao_semestral.data.repositories

import com.example.avaliacao_semestral.data.CharacterModel
import com.example.avaliacao_semestral.data.datasources.CharactersDataSource
import com.example.avaliacao_semestral.data.network.responses.toModel
import javax.inject.Inject

class CharactersRepository @Inject constructor(
    private val charactersDataSource: CharactersDataSource
) {
    suspend fun fetchCharacters(): List<CharacterModel> {
        return charactersDataSource
            .fetchCharacters()
            .characters.map { item -> item.toModel()}
    }
}
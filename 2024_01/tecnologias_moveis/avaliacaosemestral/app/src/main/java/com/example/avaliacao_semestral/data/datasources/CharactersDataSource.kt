package com.example.avaliacao_semestral.data.datasources

import com.example.avaliacao_semestral.data.network.CharacterApi
import com.example.avaliacao_semestral.data.network.responses.Results
import javax.inject.Inject

class CharactersDataSource @Inject constructor(private val api: CharacterApi) {
    suspend fun fetchCharacters(): Results {
        return this.api.fetchCharacters()
    }

}
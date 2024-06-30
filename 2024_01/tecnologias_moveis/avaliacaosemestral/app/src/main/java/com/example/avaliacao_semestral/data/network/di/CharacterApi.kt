package com.example.avaliacao_semestral.data.network;

import com.example.avaliacao_semestral.data.network.responses.Results
import retrofit2.http.GET;

interface CharacterApi {
    @GET("api/character")
    suspend fun fetchCharacters(): Results
}

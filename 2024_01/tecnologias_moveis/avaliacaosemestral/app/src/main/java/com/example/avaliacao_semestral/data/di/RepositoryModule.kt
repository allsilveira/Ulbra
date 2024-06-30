package com.example.avaliacao_semestral.data.di

import com.example.avaliacao_semestral.data.datasources.CharactersDataSource
import com.example.avaliacao_semestral.data.repositories.CharactersRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun providesCharactersRepository(
        charactersDataSource: CharactersDataSource
    ): CharactersRepository {
        return CharactersRepository(charactersDataSource)
    }
}
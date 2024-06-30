package com.example.avaliacao_semestral.data.di

import com.example.avaliacao_semestral.data.datasources.CharactersDataSource
import com.example.avaliacao_semestral.data.network.CharacterApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Provides
    @Singleton
    fun providesDataSourceModule(
        api: CharacterApi
    ): CharactersDataSource {
        return CharactersDataSource(api)
    }
}
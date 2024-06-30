package com.example.avaliacao_semestral.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.avaliacao_semestral.commons.Result
import com.example.avaliacao_semestral.data.CharacterModel
import com.example.avaliacao_semestral.data.repositories.CharactersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val charactersRepository: CharactersRepository
) : ViewModel() {

    fun fetchCharacters(): LiveData<Result<List<CharacterModel>>> {
        val liveData = MutableLiveData<Result<List<CharacterModel>>>()

        liveData.postValue(Result.Loading)

        viewModelScope.launch(Dispatchers.IO) {
            try {
                val result = charactersRepository.fetchCharacters()
                liveData.postValue(Result.Success(result))
            } catch (e: Exception) {
                liveData.postValue(Result.Error(e))
            }
        }

        return liveData
    }
}
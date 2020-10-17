package com.hero.code.presentation.view.character.show

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hero.code.domain.entity.character.Character
import com.hero.code.domain.interactor.GetCharactersList
import com.hero.code.presentation.util.base.BaseViewModel

class ShowCharacterViewModel constructor(
    private val position: Int,
    private val query: String,
    private val getCharactersList: GetCharactersList,
) : BaseViewModel() {

    val charactersList: LiveData<List<Character?>> get() = _charactersList

    private val _charactersList by lazy { MutableLiveData<List<Character?>>() }

    init {
        requestCharacters()
    }

    fun onCharacterSelected(character: Character?) {

    }

    private fun requestCharacters() {
        launchDataLoad(onFailure = ::onFailure) {
            _charactersList.value = getCharactersList.execute(position, query)
        }
    }

    private fun onFailure(throwable: Throwable) {
        setDialog(throwable) { requestCharacters() }
    }
}
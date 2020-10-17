package com.hero.code.presentation.view.heroes.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hero.code.domain.entity.character.Character
import com.hero.code.domain.interactor.GetCharactersList
import com.hero.code.presentation.util.base.BaseViewModel

class ListCharactersViewModel constructor(
    private val getCharactersList: GetCharactersList,
) : BaseViewModel() {

    val charactersList: LiveData<List<Character?>> get() = _charactersList

    private val _charactersList by lazy { MutableLiveData<List<Character?>>() }

    init {
        requestNewCharacters()
    }

    fun onCharacterSelected(character: Character?){

    }

    private fun requestNewCharacters(showPlaceholder: Boolean = true) {
        launchDataLoad(showPlaceholder, onFailure = ::onFailure) {
            _charactersList.value = getCharactersList.execute(0)
        }
    }

    private fun onFailure(throwable: Throwable) {
        setDialog(throwable) { requestNewCharacters(true) }
    }
}
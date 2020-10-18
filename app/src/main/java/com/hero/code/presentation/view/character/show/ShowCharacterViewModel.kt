package com.hero.code.presentation.view.character.show

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hero.code.domain.entity.character.Character
import com.hero.code.domain.use_case.GetCharactersList
import com.hero.code.presentation.util.base.BaseViewModel
import com.hero.code.presentation.view.character.details.CharacterDetailsNavData

class ShowCharacterViewModel constructor(
    private val position: Int,
    private val query: String,
    private val getCharactersList: GetCharactersList,
) : BaseViewModel() {

    val charactersList: LiveData<CharacterPage> get() = _charactersList

    private val _charactersList by lazy { MutableLiveData<CharacterPage>() }

    init {
        requestCharacters()
    }

    fun onCharacterSelected(character: Character?) {
        character?.let {
            goTo(CharacterDetailsNavData(it))
        }
    }

    private fun requestCharacters() {
        launchDataLoad(onFailure = ::onFailure) {
            getCharactersList.execute(position, query)?.let {
                _charactersList.value = CharacterPage.fromCharacterList(it)
            }
        }
    }

    private fun onFailure(throwable: Throwable) {
        setDialog(throwable) { requestCharacters() }
    }
}
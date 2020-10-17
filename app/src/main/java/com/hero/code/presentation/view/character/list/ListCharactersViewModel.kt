package com.hero.code.presentation.view.character.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hero.code.domain.interactor.GetCharactersTotalPages
import com.hero.code.presentation.util.base.BaseViewModel

class ListCharactersViewModel(
    private val getCharactersTotalPages: GetCharactersTotalPages
) : BaseViewModel() {

    val listCharactersInfo: LiveData<ListCharactersInfo> get() = _listCharactersInfo

    private val _listCharactersInfo by lazy { MutableLiveData<ListCharactersInfo>() }

    var currentQuery = ""

    init {
        getListCharactersInfo()
    }

    fun onQuerySubmitted(query: String?) {
        query?.let {
            currentQuery = it
            getListCharactersInfo()
        }
    }

    private fun getListCharactersInfo() {
        launchDataLoad {
            _listCharactersInfo.value = ListCharactersInfo(
                getCharactersTotalPages.execute(currentQuery),
                currentQuery
            )
        }
    }
}
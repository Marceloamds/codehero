package com.hero.code.presentation.view.character.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hero.code.domain.use_case.GetCharactersTotalPages
import com.hero.code.presentation.util.base.BaseViewModel

class ListCharactersViewModel(
    private val getCharactersTotalPages: GetCharactersTotalPages
) : BaseViewModel() {

    val listCharactersInfo: LiveData<ListCharactersInfo> get() = _listCharactersInfo

    private val _listCharactersInfo by lazy { MutableLiveData<ListCharactersInfo>() }

    private var currentQuery = ""

    init {
        getListCharactersInfo()
    }

    fun onQuerySubmitted(query: String?) {
        if (query != null && query != currentQuery) {
            currentQuery = query
            getListCharactersInfo()
        }
    }

    private fun getListCharactersInfo() {
        launchDataLoad(onFailure = ::onFailure) {
            _listCharactersInfo.value = ListCharactersInfo(
                getCharactersTotalPages.execute(currentQuery),
                currentQuery
            )
        }
    }

    private fun onFailure(throwable: Throwable) {
        setDialog(throwable) { getListCharactersInfo() }
    }
}
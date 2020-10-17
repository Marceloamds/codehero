package com.hero.code.presentation.view.character.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hero.code.domain.interactor.GetCharactersTotalPages
import com.hero.code.presentation.util.base.BaseViewModel

class ListCharactersViewModel(
    private val getCharactersTotalPages: GetCharactersTotalPages
) : BaseViewModel() {

    val totalPages: LiveData<Int> get() = _totalPages

    private val _totalPages by lazy { MutableLiveData<Int>() }

    init {
        launchDataLoad {
            _totalPages.value = getCharactersTotalPages.execute()
        }
    }
}
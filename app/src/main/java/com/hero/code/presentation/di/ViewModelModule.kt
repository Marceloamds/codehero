package com.hero.code.presentation.di

import com.hero.code.presentation.view.character.list.ListCharactersViewModel
import com.hero.code.presentation.view.character.show.ShowCharacterViewModel
import com.hero.code.presentation.view.splash.SplashViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

fun viewModelModule() = module {

    viewModel {
        ListCharactersViewModel(get())
    }

    viewModel {
        SplashViewModel()
    }

    viewModel { (position: Int, query: String) ->
        ShowCharacterViewModel(position, query, get())
    }
}
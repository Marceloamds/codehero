package com.hero.code.presentation.di

import com.hero.code.presentation.view.heroes.details.CharacterDetailsViewModel
import com.hero.code.presentation.view.heroes.list.ListCharactersViewModel
import com.hero.code.presentation.view.splash.SplashViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

fun viewModelModule() = module {

    viewModel {
        CharacterDetailsViewModel()
    }

    viewModel {
        ListCharactersViewModel(get())
    }

    viewModel { SplashViewModel() }
}
package com.hero.code.presentation.di

import com.hero.code.presentation.view.heroes.details.HeroDetailsViewModel
import com.hero.code.presentation.view.heroes.list.ListHeroesViewModel
import com.hero.code.presentation.view.splash.SplashViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

fun viewModelModule() = module {

    viewModel {
        HeroDetailsViewModel(get())
    }

    viewModel {
        ListHeroesViewModel(get(), get(), get())
    }

    viewModel { SplashViewModel() }
}
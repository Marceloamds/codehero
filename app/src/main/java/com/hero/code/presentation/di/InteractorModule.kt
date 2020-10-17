package com.hero.code.presentation.di

import com.hero.code.domain.interactor.GetCharactersList
import com.hero.code.domain.interactor.GetCharactersTotalPages
import org.koin.dsl.module

fun interactorModule() = module {
    single {
        GetCharactersList(get())
    }

    single {
        GetCharactersTotalPages(get())
    }
}
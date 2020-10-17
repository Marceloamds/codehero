package com.hero.code.presentation.di

import com.hero.code.domain.interactor.GetCharactersList
import org.koin.dsl.module

fun interactorModule() = module {
    single {
        GetCharactersList(get())
    }
}
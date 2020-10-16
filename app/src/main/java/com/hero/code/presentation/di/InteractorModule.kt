package com.hero.code.presentation.di

import com.hero.code.domain.interactor.GetFavoriteHeroesList
import com.hero.code.domain.interactor.GetHeroesList
import com.hero.code.domain.interactor.LikeHero
import org.koin.dsl.module

fun interactorModule() = module {
    single {
        GetHeroesList(get())
    }

    single {
        LikeHero(get())
    }

    single {
        GetFavoriteHeroesList(get())
    }
}
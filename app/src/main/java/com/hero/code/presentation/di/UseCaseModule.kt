package com.hero.code.presentation.di

import com.hero.code.domain.use_case.GetCharactersList
import com.hero.code.domain.use_case.GetCharactersTotalPages
import org.koin.dsl.module

fun useCaseModule() = module {
    single {
        GetCharactersList(get())
    }

    single {
        GetCharactersTotalPages(get())
    }
}
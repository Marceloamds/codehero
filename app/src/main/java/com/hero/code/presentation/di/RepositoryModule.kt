package com.hero.code.presentation.di

import com.hero.code.data.repository.DefaultCharacterRepository
import com.hero.code.domain.boundary.CharacterRepository
import org.koin.dsl.module

fun repositoryModule() = module {

    single {
        DefaultCharacterRepository(get()) as CharacterRepository
    }
}
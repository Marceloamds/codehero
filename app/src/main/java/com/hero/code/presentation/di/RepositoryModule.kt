package com.hero.code.presentation.di

import com.hero.code.data.repository.DefaultHeroRepository
import com.hero.code.domain.boundary.CharacterRepository
import org.koin.dsl.module

fun repositoryModule() = module {
    single {
        DefaultHeroRepository(get()) as CharacterRepository
    }
}
package com.hero.code.presentation.di

import com.hero.code.data.repository.DefaultHeroRepository
import com.hero.code.domain.boundary.HeroRepository
import org.koin.dsl.module

fun repositoryModule() = module {
    single {
        DefaultHeroRepository(get(), get()) as HeroRepository
    }
}
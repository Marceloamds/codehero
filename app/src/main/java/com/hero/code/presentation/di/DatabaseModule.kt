package com.hero.code.presentation.di

import com.hero.code.data.local.HeroDatabase
import org.koin.dsl.module

fun databaseModule() = module {
    single { HeroDatabase.build(get()) }

    single {
        val heroDatabase = get() as HeroDatabase
        heroDatabase.heroDao()
    }
}
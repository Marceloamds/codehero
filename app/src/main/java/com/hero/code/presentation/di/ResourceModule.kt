package com.hero.code.presentation.di

import com.hero.code.presentation.util.error.ErrorHandler
import org.koin.dsl.module

fun resourceModule() = module {

    single {
        ErrorHandler(get())
    }
}

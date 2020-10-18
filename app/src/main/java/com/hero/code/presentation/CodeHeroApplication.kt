package com.hero.code.presentation

import android.app.Application
import com.hero.code.presentation.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CodeHeroApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CodeHeroApplication)
            modules(
                listOf(
                    networkingModule(),
                    viewModelModule(),
                    repositoryModule(),
                    useCaseModule(),
                    resourceModule()
                )
            )
        }
    }
}
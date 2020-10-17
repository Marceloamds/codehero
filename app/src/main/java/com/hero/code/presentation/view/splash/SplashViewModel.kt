package com.hero.code.presentation.view.splash

import com.hero.code.presentation.util.base.BaseViewModel
import com.hero.code.presentation.view.heroes.list.ListCharacterNavData
import kotlinx.coroutines.delay

class SplashViewModel : BaseViewModel() {

    init {
        launchDataLoad {
            delay(SPLASH_DELAY)
            goTo(ListCharacterNavData())
        }
    }

    companion object {
        private const val SPLASH_DELAY = 2000L
    }
}
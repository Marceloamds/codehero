package com.hero.code.presentation.view.splash

import com.hero.code.presentation.util.base.BaseViewModel
import com.hero.code.presentation.view.character.list.ListCharactersNavData
import kotlinx.coroutines.delay

class SplashViewModel : BaseViewModel() {

    init {
        launchDataLoad {
            delay(SPLASH_DELAY)
            goTo(ListCharactersNavData())
        }
    }

    companion object {
        private const val SPLASH_DELAY = 2000L
    }
}
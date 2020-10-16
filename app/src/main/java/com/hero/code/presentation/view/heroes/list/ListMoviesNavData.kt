package com.hero.code.presentation.view.heroes.list

import android.content.Context
import com.hero.code.presentation.util.navigation.NavData

class ListHeroesNavData : NavData {

    override fun navigate(context: Context) {
        context.startActivity(ListHeroesActivity.createIntent(context))
    }
}
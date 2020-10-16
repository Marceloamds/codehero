package com.hero.code.presentation.view.heroes.details

import android.content.Context
import com.hero.code.domain.entity.hero.Hero
import com.hero.code.presentation.util.navigation.NavData

class HeroDetailsNavData(
    private val hero: Hero
) : NavData {

    override fun navigate(context: Context) {
        context.startActivity(HeroDetailsActivity.createIntent(context, hero))
    }
}
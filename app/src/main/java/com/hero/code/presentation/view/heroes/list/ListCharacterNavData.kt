package com.hero.code.presentation.view.heroes.list

import android.content.Context
import com.hero.code.presentation.util.navigation.NavData

class ListCharacterNavData : NavData {

    override fun navigate(context: Context) {
        context.startActivity(ListCharacterActivity.createIntent(context))
    }
}
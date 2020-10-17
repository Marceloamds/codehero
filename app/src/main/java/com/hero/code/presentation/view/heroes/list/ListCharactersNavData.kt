package com.hero.code.presentation.view.heroes.list

import android.content.Context
import com.hero.code.presentation.util.navigation.NavData
import com.hero.code.presentation.view.heroes.list.ListCharactersActivity

class ListCharactersNavData : NavData {

    override fun navigate(context: Context) {
        context.startActivity(ListCharactersActivity.createIntent(context))
    }
}
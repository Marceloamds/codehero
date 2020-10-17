package com.hero.code.presentation.view.character.list

import android.content.Context
import com.hero.code.presentation.util.navigation.NavData

class ListCharactersNavData : NavData {

    override fun navigate(context: Context) {
        context.startActivity(ListCharactersActivity.createIntent(context))
    }
}
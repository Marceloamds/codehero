package com.hero.code.presentation.view.heroes.details

import android.content.Context
import com.hero.code.domain.entity.character.Character
import com.hero.code.presentation.util.navigation.NavData

class CharacterDetailsNavData(
    private val character: Character
) : NavData {

    override fun navigate(context: Context) {
        context.startActivity(CharacterDetailsActivity.createIntent(context, character))
    }
}
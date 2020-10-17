package com.hero.code.domain.interactor

import com.hero.code.domain.CHARACTERS_PER_PAGE
import com.hero.code.domain.boundary.CharacterRepository
import kotlin.math.ceil

class GetCharactersTotalPages constructor(
    private val characterRepository: CharacterRepository
) {

    suspend fun execute(): Int {
        val totalCharacters = characterRepository.getCharacterListTotal() ?: 0
        return ceil(totalCharacters / CHARACTERS_PER_PAGE.toDouble()).toInt()
    }
}
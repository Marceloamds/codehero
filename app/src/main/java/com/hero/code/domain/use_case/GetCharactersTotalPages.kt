package com.hero.code.domain.use_case

import com.hero.code.domain.CHARACTERS_PER_PAGE
import com.hero.code.domain.boundary.CharacterRepository
import kotlin.math.ceil

class GetCharactersTotalPages constructor(
    private val characterRepository: CharacterRepository
) {

    suspend fun execute(query: String): Int {
        val totalCharacters = characterRepository.getCharacterListTotal(query)?.toDouble() ?: 0.0
        return ceil(totalCharacters / CHARACTERS_PER_PAGE).toInt()
    }
}
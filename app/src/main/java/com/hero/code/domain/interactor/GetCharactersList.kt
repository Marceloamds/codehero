package com.hero.code.domain.interactor

import com.hero.code.domain.boundary.CharacterRepository

class GetCharactersList constructor(
    private val characterRepository: CharacterRepository
) {

    suspend fun execute(page: Int, query: String) = characterRepository.getCharacterList(page, query)
}
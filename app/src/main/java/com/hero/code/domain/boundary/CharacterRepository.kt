package com.hero.code.domain.boundary

import com.hero.code.domain.entity.character.Character

interface CharacterRepository {
    suspend fun getCharacterList(page: Int): List<Character?>?
    suspend fun getCharacterListTotal(): Int?
}
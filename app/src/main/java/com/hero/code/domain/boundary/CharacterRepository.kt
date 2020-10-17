package com.hero.code.domain.boundary

import com.hero.code.domain.entity.character.Character

interface CharacterRepository {
    suspend fun getCharacterList(page: Int, query: String): List<Character?>?
    suspend fun getCharacterListTotal(query: String): Int?
}
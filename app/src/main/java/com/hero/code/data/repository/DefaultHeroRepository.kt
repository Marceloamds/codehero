package com.hero.code.data.repository

import com.hero.code.data.client.ApiClient
import com.hero.code.domain.boundary.CharacterRepository
import com.hero.code.domain.entity.character.Character

class DefaultHeroRepository constructor(
    private val apiClient: ApiClient
) : CharacterRepository {

    override suspend fun getCharacterList(page: Int): List<Character?>? {
        return apiClient.getCharactersList(50)?.data?.results?.map { it?.toDomainObject() }
    }

    companion object {
        private const val HEROES_PER_PAGE = 4
    }
}
package com.hero.code.data.repository

import com.hero.code.data.client.ApiClient
import com.hero.code.domain.CHARACTERS_PER_PAGE
import com.hero.code.domain.boundary.CharacterRepository
import com.hero.code.domain.entity.character.Character

class DefaultCharacterRepository constructor(
    private val apiClient: ApiClient
) : CharacterRepository {

    override suspend fun getCharacterList(page: Int, query: String): List<Character?>? {
        return apiClient.getCharactersList(
            offset = page * CHARACTERS_PER_PAGE,
            limit = CHARACTERS_PER_PAGE,
            query.nullIfEmpty()
        )?.data?.results?.map { it?.toDomainObject() }
    }

    override suspend fun getCharacterListTotal(query: String): Int? {
        return apiClient.getCharactersListTotal(
            query.nullIfEmpty()
        )?.data?.total
    }

    private fun String.nullIfEmpty() = if(isEmpty()) null else this
}
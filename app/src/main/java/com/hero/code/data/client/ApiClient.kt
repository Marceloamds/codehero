package com.hero.code.data.client

import com.hero.code.data.entity.ApiCharacterResponse
import com.hero.code.data.util.request.RequestHandler

class ApiClient constructor(
    private val apiService: ApiService
) : RequestHandler() {

    suspend fun getCharactersList(offset: Int, limit: Int): ApiCharacterResponse? {
        return makeRequest(apiService.getCharacterList(offset, limit))
    }

    suspend fun getCharactersListTotal(): ApiCharacterResponse? {
        return makeRequest(apiService.getCharactersListTotal())
    }
}
package com.hero.code.data.client

import com.hero.code.data.entity.ApiCharacterResponse
import com.hero.code.data.util.request.RequestHandler

class ApiClient constructor(
    private val apiService: ApiService
) : RequestHandler() {

    suspend fun getCharactersList(offset: Int, limit: Int, query: String?): ApiCharacterResponse? {
        return makeRequest(apiService.getCharacterList(offset, limit, query))
    }

    suspend fun getCharactersListTotal(query: String?): ApiCharacterResponse? {
        return makeRequest(apiService.getCharactersListTotal(query))
    }
}
package com.hero.code.data.client

import com.hero.code.data.entity.ApiHeroesList
import com.hero.code.data.util.request.RequestHandler

class ApiClient constructor(
    private val apiService: ApiService
) : RequestHandler() {

    suspend fun getHeroesList(offset: Int, query: String): ApiHeroesList? {
        return makeRequest(apiService.getHeroesList(offset, query))
    }
}
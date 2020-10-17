package com.hero.code.data.client

import com.hero.code.data.entity.ApiCharacterResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("characters")
    suspend fun getCharacterList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int,
        @Query("name") nameQuery: String? = null
    ): Response<ApiCharacterResponse>

    @GET("characters")
    suspend fun getCharactersListTotal(
        @Query("name") nameQuery: String? = null,
        @Query("limit") limit: Int = 1
    ): Response<ApiCharacterResponse>
}
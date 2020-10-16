package com.hero.code.data.client

import com.hero.code.data.entity.ApiHeroesList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("reviews/search.json")
    suspend fun getHeroesList(
        @Query("offset") offset: Int,
        @Query("query") query: String
    ): Response<ApiHeroesList>
}
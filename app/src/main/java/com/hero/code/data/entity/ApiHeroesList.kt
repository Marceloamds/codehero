package com.hero.code.data.entity

import com.google.gson.annotations.SerializedName
import com.hero.code.domain.entity.hero.HeroesList

data class ApiHeroesList(
    @SerializedName("status") val status: String,
    @SerializedName("copyright") val copyright: String,
    @SerializedName("has_more") val hasMore: Boolean,
    @SerializedName("num_results") val numResults: Int,
    @SerializedName("results") val results: List<ApiHero>
) {

    fun toDomainObject(): HeroesList {
        return HeroesList(
            hasMore = hasMore,
            heroes = results.map { it.toDomainObject() }
        )
    }
}
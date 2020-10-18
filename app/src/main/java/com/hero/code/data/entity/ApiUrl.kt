package com.hero.code.data.entity

import com.google.gson.annotations.SerializedName
import com.hero.code.domain.entity.character.Url
import com.hero.code.domain.entity.character.UrlType

data class ApiUrl(
    @SerializedName("type") val type: String?,
    @SerializedName("url") val url: String?,
) {

    fun toDomainObject() = Url(
        type = type?.getUrlType(),
        url = url
    )

    private fun String.getUrlType() = when (this) {
        DETAIL_URL_TYPE -> UrlType.Detail
        WIKI_URL_TYPE -> UrlType.Wiki
        COMIC_URL_TYPE -> UrlType.ComicLink
        else -> UrlType.Other(this)
    }

    companion object {
        const val DETAIL_URL_TYPE = "detail"
        const val WIKI_URL_TYPE = "wiki"
        const val COMIC_URL_TYPE = "comiclink"
    }
}
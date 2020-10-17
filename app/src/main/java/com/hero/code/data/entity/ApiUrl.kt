package com.hero.code.data.entity

import com.google.gson.annotations.SerializedName
import com.hero.code.domain.entity.character.Url

data class ApiUrl(
    @SerializedName("type") val type: String?,
    @SerializedName("url") val url: String?,
) {

    fun toDomainObject() = Url(
        type = type,
        url = url
    )
}
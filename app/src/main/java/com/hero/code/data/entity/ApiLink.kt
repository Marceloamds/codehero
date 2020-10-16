package com.hero.code.data.entity

import com.google.gson.annotations.SerializedName
import com.hero.code.domain.entity.hero.Link

data class ApiLink(
    @SerializedName("type") val type: String?,
    @SerializedName("url") val url: String,
    @SerializedName("suggested_link_text") val suggestedLinkText: String?
) {

    fun toDomainObject() = Link(
        type = type,
        url = url,
        suggestedLinkText = suggestedLinkText,
    )
}
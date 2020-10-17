package com.hero.code.data.entity

import com.google.gson.annotations.SerializedName
import com.hero.code.domain.entity.character.Image

data class ApiImage(
    @SerializedName("path") val path: String?,
    @SerializedName("extension") val extension: String?,
) {

    fun toDomainObject() = Image(
        path = path,
        extension = extension
    )
}
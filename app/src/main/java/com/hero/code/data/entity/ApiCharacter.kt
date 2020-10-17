package com.hero.code.data.entity

import com.google.gson.annotations.SerializedName
import com.hero.code.domain.entity.character.Character
import java.util.*

data class ApiCharacter(
    @SerializedName("id") val id: Int?,
    @SerializedName("name") val name: String?,
    @SerializedName("description") val description: String?,
    @SerializedName("modified") val modified: Date?,
    @SerializedName("resourceURI") val resourceURI: String?,
    @SerializedName("urls") val urls: List<ApiUrl>?,
    @SerializedName("thumbnail") val thumbnail: ApiImage?,
) {

    fun toDomainObject() = Character(
        id = id,
        name = name,
        description = description,
        modified = modified,
        resourceURI = resourceURI,
        urls = urls?.map { it.toDomainObject() },
        thumbnail = thumbnail?.toDomainObject()
    )
}
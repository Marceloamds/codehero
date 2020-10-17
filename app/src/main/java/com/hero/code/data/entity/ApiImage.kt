package com.hero.code.data.entity

import com.google.gson.annotations.SerializedName

data class ApiImage(
    @SerializedName("path") val path: String?,
    @SerializedName("extension") val extension: String?,
) {

    fun toDomainObject() = "$path.$extension"
}
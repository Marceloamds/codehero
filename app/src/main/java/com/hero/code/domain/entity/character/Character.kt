package com.hero.code.domain.entity.character

import java.io.Serializable
import java.util.*

data class Character(
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val modified: Date? = null,
    val resourceURI: String? = null,
    val urls: List<Url>? = null,
    val thumbnail: Image? = null,
) : Serializable
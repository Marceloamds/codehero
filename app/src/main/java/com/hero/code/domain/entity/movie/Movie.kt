package com.hero.code.domain.entity.hero

import java.io.Serializable
import java.util.*

data class Hero(
    val displayTitle: String,
    val criticsPick: Int,
    val byline: String,
    val headline: String,
    val summaryShort: String,
    val publicationDate: Date,
    val openingDate: Date?,
    val link: Link,
    val multimedia: Multimedia?,
    var isFavorite: Boolean = false
) : Serializable

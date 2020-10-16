package com.hero.code.domain.entity.hero

import java.io.Serializable
import java.lang.Exception

data class HeroesList(
    var hasMore: Boolean,
    val heroes: List<Hero>,
    var exception: Exception? = null
) : Serializable
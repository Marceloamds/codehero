package com.hero.code.domain.entity.character

import java.io.Serializable

data class Url(
    val type: String? = null,
    val url: String? = null,
) : Serializable
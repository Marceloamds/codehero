package com.hero.code.domain.entity.character

import java.io.Serializable

data class Image(
    val path: String? = null,
    val extension: String? = null,
) : Serializable
package com.hero.code.domain.entity.character

import java.io.Serializable

data class Url(
    val type: UrlType?,
    val url: String?,
) : Serializable
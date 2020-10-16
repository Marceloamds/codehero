package com.hero.code.domain.entity.hero

import java.io.Serializable

data class Link(
    val type: String?,
    val url: String,
    val suggestedLinkText: String?
) : Serializable
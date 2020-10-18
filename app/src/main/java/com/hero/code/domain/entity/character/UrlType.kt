package com.hero.code.domain.entity.character

import java.io.Serializable

sealed class UrlType : Serializable {

    object Detail : UrlType()
    object ComicLink : UrlType()
    object Wiki : UrlType()
    class Other(val type: String) : UrlType()
}
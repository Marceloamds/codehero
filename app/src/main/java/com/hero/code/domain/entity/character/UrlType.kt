package com.hero.code.domain.entity.character

sealed class UrlType {

    object Detail : UrlType()
    object ComicLink : UrlType()
    object Wiki : UrlType()
    class Other(val type: String) : UrlType()
}
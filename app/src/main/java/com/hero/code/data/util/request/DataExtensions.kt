package com.hero.code.data.util.request

fun String.containsQuery(): String {
    return "%$this%"
}
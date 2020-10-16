package com.hero.code.domain.interactor

import com.hero.code.domain.boundary.HeroRepository

class GetHeroesList constructor(
    private val heroRepository: HeroRepository
) {

    suspend fun execute(page: Int, query: String) = heroRepository.getHeroesList(page, query)
}
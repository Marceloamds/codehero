package com.nyt.movies.presentation.di

import com.nyt.movies.data.repository.DefaultMovieRepository
import com.nyt.movies.domain.boundary.MovieRepository
import org.koin.dsl.module

fun repositoryModule() = module {
    single {
        DefaultMovieRepository(get(), get()) as MovieRepository
    }
}
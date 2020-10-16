package com.nyt.movies.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ#\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\f\u0010\u0016\u001a\u00020\n*\u00020\nH\u0002J\f\u0010\u0017\u001a\u00020\n*\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/nyt/movies/data/repository/DefaultMovieRepository;", "Lcom/nyt/movies/domain/boundary/MovieRepository;", "apiClient", "Lcom/nyt/movies/data/remote/client/ApiClient;", "movieDao", "Lcom/nyt/movies/data/local/dao/MovieDao;", "(Lcom/nyt/movies/data/remote/client/ApiClient;Lcom/nyt/movies/data/local/dao/MovieDao;)V", "getFavoriteMoviesList", "Lcom/nyt/movies/domain/entity/movie/MoviesList;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMoviesFromDatabase", "query", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMoviesList", "likeMovie", "Lcom/nyt/movies/domain/entity/movie/Movie;", "movie", "(Lcom/nyt/movies/domain/entity/movie/Movie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDatabaseWithApi", "apiPage", "localPage", "Companion", "app_debug"})
public final class DefaultMovieRepository implements com.nyt.movies.domain.boundary.MovieRepository {
    private final com.nyt.movies.data.remote.client.ApiClient apiClient = null;
    private final com.nyt.movies.data.local.dao.MovieDao movieDao = null;
    private static final int MOVIES_PER_PAGE = 20;
    public static final com.nyt.movies.data.repository.DefaultMovieRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMoviesList(int page, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyt.movies.domain.entity.movie.MoviesList> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object likeMovie(@org.jetbrains.annotations.NotNull()
    com.nyt.movies.domain.entity.movie.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyt.movies.domain.entity.movie.Movie> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFavoriteMoviesList(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyt.movies.domain.entity.movie.MoviesList> p1) {
        return null;
    }
    
    private final int localPage(int $this$localPage) {
        return 0;
    }
    
    private final int apiPage(int $this$apiPage) {
        return 0;
    }
    
    public DefaultMovieRepository(@org.jetbrains.annotations.NotNull()
    com.nyt.movies.data.remote.client.ApiClient apiClient, @org.jetbrains.annotations.NotNull()
    com.nyt.movies.data.local.dao.MovieDao movieDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/nyt/movies/data/repository/DefaultMovieRepository$Companion;", "", "()V", "MOVIES_PER_PAGE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
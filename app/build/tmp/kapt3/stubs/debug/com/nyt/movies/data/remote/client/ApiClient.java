package com.nyt.movies.data.remote.client;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/nyt/movies/data/remote/client/ApiClient;", "Lcom/nyt/movies/data/util/request/RequestHandler;", "apiService", "Lcom/nyt/movies/data/remote/client/ApiService;", "(Lcom/nyt/movies/data/remote/client/ApiService;)V", "getMoviesList", "Lcom/nyt/movies/data/remote/entity/ApiMoviesList;", "offset", "", "query", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ApiClient extends com.nyt.movies.data.util.request.RequestHandler {
    private final com.nyt.movies.data.remote.client.ApiService apiService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMoviesList(int offset, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyt.movies.data.remote.entity.ApiMoviesList> p2) {
        return null;
    }
    
    public ApiClient(@org.jetbrains.annotations.NotNull()
    com.nyt.movies.data.remote.client.ApiService apiService) {
        super();
    }
}
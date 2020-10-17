package com.hero.code.data.client;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/hero/code/data/client/ApiService;", "", "getCharacterList", "Lretrofit2/Response;", "Lcom/hero/code/data/entity/ApiCharacterResponse;", "offset", "", "limit", "nameQuery", "", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharactersListTotal", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "characters")
    public abstract java.lang.Object getCharacterList(@retrofit2.http.Query(value = "offset")
    int offset, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "name")
    java.lang.String nameQuery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.hero.code.data.entity.ApiCharacterResponse>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "characters")
    public abstract java.lang.Object getCharactersListTotal(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "name")
    java.lang.String nameQuery, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.hero.code.data.entity.ApiCharacterResponse>> p2);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}
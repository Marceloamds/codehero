package com.hero.code.domain.use_case;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/hero/code/domain/use_case/GetCharactersList;", "", "characterRepository", "Lcom/hero/code/domain/boundary/CharacterRepository;", "(Lcom/hero/code/domain/boundary/CharacterRepository;)V", "execute", "", "Lcom/hero/code/domain/entity/character/Character;", "page", "", "query", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetCharactersList {
    private final com.hero.code.domain.boundary.CharacterRepository characterRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object execute(int page, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.hero.code.domain.entity.character.Character>> p2) {
        return null;
    }
    
    public GetCharactersList(@org.jetbrains.annotations.NotNull()
    com.hero.code.domain.boundary.CharacterRepository characterRepository) {
        super();
    }
}
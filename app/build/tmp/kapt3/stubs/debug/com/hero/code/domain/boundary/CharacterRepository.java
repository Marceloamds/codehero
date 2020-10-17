package com.hero.code.domain.boundary;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/hero/code/domain/boundary/CharacterRepository;", "", "getCharacterList", "", "Lcom/hero/code/domain/entity/character/Character;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharacterListTotal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CharacterRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCharacterList(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.hero.code.domain.entity.character.Character>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCharacterListTotal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0);
}
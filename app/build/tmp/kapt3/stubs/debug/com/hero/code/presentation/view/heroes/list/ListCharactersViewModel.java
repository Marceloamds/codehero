package com.hero.code.presentation.view.heroes.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002R)\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/hero/code/presentation/view/heroes/list/ListCharactersViewModel;", "Lcom/hero/code/presentation/util/base/BaseViewModel;", "getCharactersList", "Lcom/hero/code/domain/interactor/GetCharactersList;", "(Lcom/hero/code/domain/interactor/GetCharactersList;)V", "_charactersList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/hero/code/domain/entity/character/Character;", "get_charactersList", "()Landroidx/lifecycle/MutableLiveData;", "_charactersList$delegate", "Lkotlin/Lazy;", "charactersList", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "onCharacterSelected", "", "character", "onFailure", "throwable", "", "requestNewCharacters", "showPlaceholder", "", "app_debug"})
public final class ListCharactersViewModel extends com.hero.code.presentation.util.base.BaseViewModel {
    private final kotlin.Lazy _charactersList$delegate = null;
    private final com.hero.code.domain.interactor.GetCharactersList getCharactersList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.hero.code.domain.entity.character.Character>> getCharactersList() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hero.code.domain.entity.character.Character>> get_charactersList() {
        return null;
    }
    
    public final void onCharacterSelected(@org.jetbrains.annotations.Nullable()
    com.hero.code.domain.entity.character.Character character) {
    }
    
    private final void requestNewCharacters(boolean showPlaceholder) {
    }
    
    private final void onFailure(java.lang.Throwable throwable) {
    }
    
    public ListCharactersViewModel(@org.jetbrains.annotations.NotNull()
    com.hero.code.domain.interactor.GetCharactersList getCharactersList) {
        super();
    }
}
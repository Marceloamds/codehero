package com.hero.code.presentation.view.character.show;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002R)\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/hero/code/presentation/view/character/show/ShowCharacterViewModel;", "Lcom/hero/code/presentation/util/base/BaseViewModel;", "position", "", "getCharactersList", "Lcom/hero/code/domain/interactor/GetCharactersList;", "(ILcom/hero/code/domain/interactor/GetCharactersList;)V", "_charactersList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/hero/code/domain/entity/character/Character;", "get_charactersList", "()Landroidx/lifecycle/MutableLiveData;", "_charactersList$delegate", "Lkotlin/Lazy;", "charactersList", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "onCharacterSelected", "", "character", "onFailure", "throwable", "", "requestCharacters", "app_debug"})
public final class ShowCharacterViewModel extends com.hero.code.presentation.util.base.BaseViewModel {
    private final kotlin.Lazy _charactersList$delegate = null;
    private final int position = 0;
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
    
    private final void requestCharacters() {
    }
    
    private final void onFailure(java.lang.Throwable throwable) {
    }
    
    public ShowCharacterViewModel(int position, @org.jetbrains.annotations.NotNull()
    com.hero.code.domain.interactor.GetCharactersList getCharactersList) {
        super();
    }
}
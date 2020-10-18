package com.hero.code.presentation.view.character.show;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/hero/code/presentation/view/character/show/ShowCharacterViewModel;", "Lcom/hero/code/presentation/util/base/BaseViewModel;", "position", "", "query", "", "getCharactersList", "Lcom/hero/code/domain/use_case/GetCharactersList;", "(ILjava/lang/String;Lcom/hero/code/domain/use_case/GetCharactersList;)V", "_charactersList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/hero/code/presentation/view/character/show/CharacterPage;", "get_charactersList", "()Landroidx/lifecycle/MutableLiveData;", "_charactersList$delegate", "Lkotlin/Lazy;", "charactersList", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "onCharacterSelected", "", "character", "Lcom/hero/code/domain/entity/character/Character;", "onFailure", "throwable", "", "requestCharacters", "app_debug"})
public final class ShowCharacterViewModel extends com.hero.code.presentation.util.base.BaseViewModel {
    private final kotlin.Lazy _charactersList$delegate = null;
    private final int position = 0;
    private final java.lang.String query = null;
    private final com.hero.code.domain.use_case.GetCharactersList getCharactersList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hero.code.presentation.view.character.show.CharacterPage> getCharactersList() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<com.hero.code.presentation.view.character.show.CharacterPage> get_charactersList() {
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
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    com.hero.code.domain.use_case.GetCharactersList getCharactersList) {
        super();
    }
}
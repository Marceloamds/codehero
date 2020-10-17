package com.hero.code.presentation.view.character.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\rR!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0019"}, d2 = {"Lcom/hero/code/presentation/view/character/list/ListCharactersViewModel;", "Lcom/hero/code/presentation/util/base/BaseViewModel;", "getCharactersTotalPages", "Lcom/hero/code/domain/interactor/GetCharactersTotalPages;", "(Lcom/hero/code/domain/interactor/GetCharactersTotalPages;)V", "_listCharactersInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/hero/code/presentation/view/character/list/ListCharactersInfo;", "get_listCharactersInfo", "()Landroidx/lifecycle/MutableLiveData;", "_listCharactersInfo$delegate", "Lkotlin/Lazy;", "currentQuery", "", "getCurrentQuery", "()Ljava/lang/String;", "setCurrentQuery", "(Ljava/lang/String;)V", "listCharactersInfo", "Landroidx/lifecycle/LiveData;", "getListCharactersInfo", "()Landroidx/lifecycle/LiveData;", "", "onQuerySubmitted", "query", "app_debug"})
public final class ListCharactersViewModel extends com.hero.code.presentation.util.base.BaseViewModel {
    private final kotlin.Lazy _listCharactersInfo$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentQuery = "";
    private final com.hero.code.domain.interactor.GetCharactersTotalPages getCharactersTotalPages = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hero.code.presentation.view.character.list.ListCharactersInfo> getListCharactersInfo() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<com.hero.code.presentation.view.character.list.ListCharactersInfo> get_listCharactersInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentQuery() {
        return null;
    }
    
    public final void setCurrentQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void onQuerySubmitted(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    private final void getListCharactersInfo() {
    }
    
    public ListCharactersViewModel(@org.jetbrains.annotations.NotNull()
    com.hero.code.domain.interactor.GetCharactersTotalPages getCharactersTotalPages) {
        super();
    }
}
package com.hero.code.presentation.view.character.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/hero/code/presentation/view/character/list/ListCharactersViewModel;", "Lcom/hero/code/presentation/util/base/BaseViewModel;", "getCharactersTotalPages", "Lcom/hero/code/domain/interactor/GetCharactersTotalPages;", "(Lcom/hero/code/domain/interactor/GetCharactersTotalPages;)V", "_totalPages", "Landroidx/lifecycle/MutableLiveData;", "", "get_totalPages", "()Landroidx/lifecycle/MutableLiveData;", "_totalPages$delegate", "Lkotlin/Lazy;", "totalPages", "Landroidx/lifecycle/LiveData;", "getTotalPages", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class ListCharactersViewModel extends com.hero.code.presentation.util.base.BaseViewModel {
    private final kotlin.Lazy _totalPages$delegate = null;
    private final com.hero.code.domain.interactor.GetCharactersTotalPages getCharactersTotalPages = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTotalPages() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> get_totalPages() {
        return null;
    }
    
    public ListCharactersViewModel(@org.jetbrains.annotations.NotNull()
    com.hero.code.domain.interactor.GetCharactersTotalPages getCharactersTotalPages) {
        super();
    }
}
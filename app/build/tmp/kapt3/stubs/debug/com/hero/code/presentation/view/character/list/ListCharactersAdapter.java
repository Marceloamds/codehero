package com.hero.code.presentation.view.character.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/hero/code/presentation/view/character/list/ListCharactersAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "totalPages", "", "query", "", "(Landroidx/fragment/app/FragmentActivity;ILjava/lang/String;)V", "createFragment", "Lcom/hero/code/presentation/view/character/show/ShowCharacterFragment;", "position", "getItemCount", "app_debug"})
public final class ListCharactersAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final int totalPages = 0;
    private final java.lang.String query = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hero.code.presentation.view.character.show.ShowCharacterFragment createFragment(int position) {
        return null;
    }
    
    public ListCharactersAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity fragmentActivity, int totalPages, @org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        super(null);
    }
}
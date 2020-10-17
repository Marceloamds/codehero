package com.hero.code.presentation.view.heroes.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/hero/code/presentation/view/heroes/list/ListCharactersAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/hero/code/domain/entity/character/Character;", "Lcom/hero/code/presentation/view/heroes/list/CharacterViewHolder;", "onCharacterClickedCallback", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffUtilCallback", "app_debug"})
public final class ListCharactersAdapter extends androidx.recyclerview.widget.ListAdapter<com.hero.code.domain.entity.character.Character, com.hero.code.presentation.view.heroes.list.CharacterViewHolder> {
    private final kotlin.jvm.functions.Function1<com.hero.code.domain.entity.character.Character, kotlin.Unit> onCharacterClickedCallback = null;
    public static final com.hero.code.presentation.view.heroes.list.ListCharactersAdapter.DiffUtilCallback DiffUtilCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hero.code.presentation.view.heroes.list.CharacterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.hero.code.presentation.view.heroes.list.CharacterViewHolder holder, int position) {
    }
    
    public ListCharactersAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.hero.code.domain.entity.character.Character, kotlin.Unit> onCharacterClickedCallback) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/hero/code/presentation/view/heroes/list/ListCharactersAdapter$DiffUtilCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/hero/code/domain/entity/character/Character;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffUtilCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.hero.code.domain.entity.character.Character> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.hero.code.domain.entity.character.Character oldItem, @org.jetbrains.annotations.NotNull()
        com.hero.code.domain.entity.character.Character newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.hero.code.domain.entity.character.Character oldItem, @org.jetbrains.annotations.NotNull()
        com.hero.code.domain.entity.character.Character newItem) {
            return false;
        }
        
        private DiffUtilCallback() {
            super();
        }
    }
}
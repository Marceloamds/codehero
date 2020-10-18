package com.hero.code.presentation.view.character.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/hero/code/presentation/view/character/details/CharacterUrlsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/hero/code/domain/entity/character/Url;", "Lcom/hero/code/presentation/view/character/details/CharacterUrlViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffUtilCallback", "app_debug"})
public final class CharacterUrlsAdapter extends androidx.recyclerview.widget.ListAdapter<com.hero.code.domain.entity.character.Url, com.hero.code.presentation.view.character.details.CharacterUrlViewHolder> {
    public static final com.hero.code.presentation.view.character.details.CharacterUrlsAdapter.DiffUtilCallback DiffUtilCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hero.code.presentation.view.character.details.CharacterUrlViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.hero.code.presentation.view.character.details.CharacterUrlViewHolder holder, int position) {
    }
    
    public CharacterUrlsAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/hero/code/presentation/view/character/details/CharacterUrlsAdapter$DiffUtilCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/hero/code/domain/entity/character/Url;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffUtilCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.hero.code.domain.entity.character.Url> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.hero.code.domain.entity.character.Url oldItem, @org.jetbrains.annotations.NotNull()
        com.hero.code.domain.entity.character.Url newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.hero.code.domain.entity.character.Url oldItem, @org.jetbrains.annotations.NotNull()
        com.hero.code.domain.entity.character.Url newItem) {
            return false;
        }
        
        private DiffUtilCallback() {
            super();
        }
    }
}
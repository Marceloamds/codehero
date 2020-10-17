package com.hero.code.presentation.view.character.show;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0015\u001a\u00020\u00162\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0018H\u0002J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020\u0016H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\'"}, d2 = {"Lcom/hero/code/presentation/view/character/show/ShowCharacterFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_viewModel", "Lcom/hero/code/presentation/view/character/show/ShowCharacterViewModel;", "get_viewModel", "()Lcom/hero/code/presentation/view/character/show/ShowCharacterViewModel;", "_viewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/hero/code/databinding/FragmentShowCharacterBinding;", "position", "", "getPosition", "()I", "position$delegate", "query", "", "getQuery", "()Ljava/lang/String;", "query$delegate", "onCharactersReceived", "", "characterList", "", "Lcom/hero/code/domain/entity/character/Character;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onGoTo", "navData", "Lcom/hero/code/presentation/util/navigation/NavData;", "subscribeUi", "Companion", "app_debug"})
public final class ShowCharacterFragment extends androidx.fragment.app.Fragment {
    private com.hero.code.databinding.FragmentShowCharacterBinding binding;
    private final kotlin.Lazy position$delegate = null;
    private final kotlin.Lazy query$delegate = null;
    private final kotlin.Lazy _viewModel$delegate = null;
    private static final java.lang.String POSITION_EXTRA = "POSITION_EXTRA";
    private static final java.lang.String QUERY_EXTRA = "QUERY_EXTRA";
    public static final com.hero.code.presentation.view.character.show.ShowCharacterFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final int getPosition() {
        return 0;
    }
    
    private final java.lang.String getQuery() {
        return null;
    }
    
    private final com.hero.code.presentation.view.character.show.ShowCharacterViewModel get_viewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void subscribeUi() {
    }
    
    private final void onCharactersReceived(java.util.List<com.hero.code.domain.entity.character.Character> characterList) {
    }
    
    private final void onGoTo(com.hero.code.presentation.util.navigation.NavData navData) {
    }
    
    public ShowCharacterFragment() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(value = {"loadCharacterImage"})
    public static final void loadCharacterImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadCharacterImage, @org.jetbrains.annotations.Nullable()
    com.hero.code.domain.entity.character.Character character) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\f*\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/hero/code/presentation/view/character/show/ShowCharacterFragment$Companion;", "", "()V", "POSITION_EXTRA", "", "QUERY_EXTRA", "newInstance", "Lcom/hero/code/presentation/view/character/show/ShowCharacterFragment;", "position", "", "query", "loadCharacterImage", "", "Landroid/widget/ImageView;", "character", "Lcom/hero/code/domain/entity/character/Character;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.hero.code.presentation.view.character.show.ShowCharacterFragment newInstance(int position, @org.jetbrains.annotations.NotNull()
        java.lang.String query) {
            return null;
        }
        
        @androidx.databinding.BindingAdapter(value = {"loadCharacterImage"})
        public final void loadCharacterImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView $this$loadCharacterImage, @org.jetbrains.annotations.Nullable()
        com.hero.code.domain.entity.character.Character character) {
        }
        
        private Companion() {
            super();
        }
    }
}
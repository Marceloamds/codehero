package com.hero.code.presentation.view.character.show;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0010\u001a\u00020\u00112\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013H\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010 \u001a\u00020\u0011H\u0002J\b\u0010!\u001a\u00020\u0011H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lcom/hero/code/presentation/view/character/show/ShowCharacterFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_viewModel", "Lcom/hero/code/presentation/view/character/show/ShowCharacterViewModel;", "get_viewModel", "()Lcom/hero/code/presentation/view/character/show/ShowCharacterViewModel;", "_viewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/hero/code/databinding/FragmentShowCharacterBinding;", "position", "", "getPosition", "()I", "position$delegate", "onCharactersReceived", "", "characterList", "", "Lcom/hero/code/domain/entity/character/Character;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onGoTo", "navData", "Lcom/hero/code/presentation/util/navigation/NavData;", "setupUi", "subscribeUi", "Companion", "app_debug"})
public final class ShowCharacterFragment extends androidx.fragment.app.Fragment {
    private com.hero.code.databinding.FragmentShowCharacterBinding binding;
    private final kotlin.Lazy position$delegate = null;
    private final kotlin.Lazy _viewModel$delegate = null;
    private static final java.lang.String POSITION_EXTRA = "POSITION_EXTRA";
    public static final com.hero.code.presentation.view.character.show.ShowCharacterFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final int getPosition() {
        return 0;
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
    
    private final void setupUi() {
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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/hero/code/presentation/view/character/show/ShowCharacterFragment$Companion;", "", "()V", "POSITION_EXTRA", "", "newInstance", "Lcom/hero/code/presentation/view/character/show/ShowCharacterFragment;", "position", "", "loadCharacterImage", "", "Landroid/widget/ImageView;", "character", "Lcom/hero/code/domain/entity/character/Character;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.hero.code.presentation.view.character.show.ShowCharacterFragment newInstance(int position) {
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
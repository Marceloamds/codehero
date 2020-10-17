package com.hero.code.databinding;
import com.hero.code.R;
import com.hero.code.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityListCharactersBindingImpl extends ActivityListCharactersBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.text_list_characters_title, 1);
        sViewsWithIds.put(R.id.text_character_name_label, 2);
        sViewsWithIds.put(R.id.search_view_character, 3);
        sViewsWithIds.put(R.id.view_pager_label, 4);
        sViewsWithIds.put(R.id.character_view_pager, 5);
        sViewsWithIds.put(R.id.button_previous_page, 6);
        sViewsWithIds.put(R.id.button_next_page, 7);
        sViewsWithIds.put(R.id.view_pager_indicator, 8);
        sViewsWithIds.put(R.id.empty_list_layout, 9);
        sViewsWithIds.put(R.id.image_view_empty_list, 10);
        sViewsWithIds.put(R.id.text_view_empty_message, 11);
        sViewsWithIds.put(R.id.button_try_again, 12);
        sViewsWithIds.put(R.id.placeholder_view, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityListCharactersBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityListCharactersBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.Button) bindings[12]
            , (androidx.viewpager2.widget.ViewPager2) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (com.hero.code.presentation.util.placeholder.PlaceholderView) bindings[13]
            , (androidx.appcompat.widget.SearchView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[11]
            , (com.google.android.material.tabs.TabLayout) bindings[8]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}
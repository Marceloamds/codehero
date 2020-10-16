package com.hero.code.databinding;
import com.hero.code.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHeroesDetailsBindingImpl extends ActivityHeroesDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout, 1);
        sViewsWithIds.put(R.id.image_view_hero_poster, 2);
        sViewsWithIds.put(R.id.button_go_back, 3);
        sViewsWithIds.put(R.id.button_favorite, 4);
        sViewsWithIds.put(R.id.guideline, 5);
        sViewsWithIds.put(R.id.constraint_layout_hero_details, 6);
        sViewsWithIds.put(R.id.text_view_hero_title, 7);
        sViewsWithIds.put(R.id.button_share, 8);
        sViewsWithIds.put(R.id.text_view_opening_date, 9);
        sViewsWithIds.put(R.id.text_view_synopsis_hint, 10);
        sViewsWithIds.put(R.id.text_view_synopsis, 11);
        sViewsWithIds.put(R.id.text_view_review_hint, 12);
        sViewsWithIds.put(R.id.text_view_review_title, 13);
        sViewsWithIds.put(R.id.text_view_publication, 14);
        sViewsWithIds.put(R.id.button_go_to_review, 15);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHeroesDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityHeroesDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.Button) bindings[15]
            , (android.widget.ImageView) bindings[8]
            , (androidx.constraintlayout.motion.widget.MotionLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.view.View) bindings[5]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
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
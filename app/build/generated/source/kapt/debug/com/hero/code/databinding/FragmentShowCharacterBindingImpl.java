package com.hero.code.databinding;
import com.hero.code.R;
import com.hero.code.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentShowCharacterBindingImpl extends FragmentShowCharacterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(0, 
            new String[] {"item_character", "item_character", "item_character", "item_character"},
            new int[] {1, 2, 3, 4},
            new int[] {com.hero.code.R.layout.item_character,
                com.hero.code.R.layout.item_character,
                com.hero.code.R.layout.item_character,
                com.hero.code.R.layout.item_character});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.first_divider, 5);
        sViewsWithIds.put(R.id.second_divider, 6);
        sViewsWithIds.put(R.id.third_divider, 7);
        sViewsWithIds.put(R.id.fourth_divider, 8);
        sViewsWithIds.put(R.id.placeholder_view, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentShowCharacterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentShowCharacterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.hero.code.databinding.ItemCharacterBinding) bindings[1]
            , (android.view.View) bindings[5]
            , (com.hero.code.databinding.ItemCharacterBinding) bindings[4]
            , (android.view.View) bindings[8]
            , (com.hero.code.presentation.util.placeholder.PlaceholderView) bindings[9]
            , (com.hero.code.databinding.ItemCharacterBinding) bindings[2]
            , (android.view.View) bindings[6]
            , (com.hero.code.databinding.ItemCharacterBinding) bindings[3]
            , (android.view.View) bindings[7]
            );
        setContainedBinding(this.firstCharacter);
        setContainedBinding(this.fourthCharacter);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.secondCharacter);
        setContainedBinding(this.thirdCharacter);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        firstCharacter.invalidateAll();
        secondCharacter.invalidateAll();
        thirdCharacter.invalidateAll();
        fourthCharacter.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (firstCharacter.hasPendingBindings()) {
            return true;
        }
        if (secondCharacter.hasPendingBindings()) {
            return true;
        }
        if (thirdCharacter.hasPendingBindings()) {
            return true;
        }
        if (fourthCharacter.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        firstCharacter.setLifecycleOwner(lifecycleOwner);
        secondCharacter.setLifecycleOwner(lifecycleOwner);
        thirdCharacter.setLifecycleOwner(lifecycleOwner);
        fourthCharacter.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFourthCharacter((com.hero.code.databinding.ItemCharacterBinding) object, fieldId);
            case 1 :
                return onChangeSecondCharacter((com.hero.code.databinding.ItemCharacterBinding) object, fieldId);
            case 2 :
                return onChangeFirstCharacter((com.hero.code.databinding.ItemCharacterBinding) object, fieldId);
            case 3 :
                return onChangeThirdCharacter((com.hero.code.databinding.ItemCharacterBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFourthCharacter(com.hero.code.databinding.ItemCharacterBinding FourthCharacter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSecondCharacter(com.hero.code.databinding.ItemCharacterBinding SecondCharacter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFirstCharacter(com.hero.code.databinding.ItemCharacterBinding FirstCharacter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeThirdCharacter(com.hero.code.databinding.ItemCharacterBinding ThirdCharacter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
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
        executeBindingsOn(firstCharacter);
        executeBindingsOn(secondCharacter);
        executeBindingsOn(thirdCharacter);
        executeBindingsOn(fourthCharacter);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fourthCharacter
        flag 1 (0x2L): secondCharacter
        flag 2 (0x3L): firstCharacter
        flag 3 (0x4L): thirdCharacter
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}
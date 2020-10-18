// Generated by data binding compiler. Do not edit!
package com.hero.code.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.hero.code.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemUrlBinding extends ViewDataBinding {
  @NonNull
  public final Button buttonGoTo;

  protected ItemUrlBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button buttonGoTo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonGoTo = buttonGoTo;
  }

  @NonNull
  public static ItemUrlBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_url, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemUrlBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemUrlBinding>inflateInternal(inflater, R.layout.item_url, root, attachToRoot, component);
  }

  @NonNull
  public static ItemUrlBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_url, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemUrlBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemUrlBinding>inflateInternal(inflater, R.layout.item_url, null, false, component);
  }

  public static ItemUrlBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemUrlBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemUrlBinding)bind(component, view, R.layout.item_url);
  }
}
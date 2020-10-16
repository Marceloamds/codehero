package com.hero.code;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.hero.code.databinding.ActivityListHeroesBindingImpl;
import com.hero.code.databinding.ActivityHeroesDetailsBindingImpl;
import com.hero.code.databinding.ActivitySplashBindingImpl;
import com.hero.code.databinding.ItemHeroBindingImpl;
import com.hero.code.databinding.ItemProgressBindingImpl;
import com.hero.code.databinding.LoadingPlaceholderBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYLISTHEROES = 1;

  private static final int LAYOUT_ACTIVITYHEROESDETAILS = 2;

  private static final int LAYOUT_ACTIVITYSPLASH = 3;

  private static final int LAYOUT_ITEMHERO = 4;

  private static final int LAYOUT_ITEMPROGRESS = 5;

  private static final int LAYOUT_LOADINGPLACEHOLDER = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hero.code.R.layout.activity_list_heroes, LAYOUT_ACTIVITYLISTHEROES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hero.code.R.layout.activity_heroes_details, LAYOUT_ACTIVITYHEROESDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hero.code.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hero.code.R.layout.item_hero, LAYOUT_ITEMHERO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hero.code.R.layout.item_progress, LAYOUT_ITEMPROGRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hero.code.R.layout.loading_placeholder, LAYOUT_LOADINGPLACEHOLDER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYLISTHEROES: {
          if ("layout/activity_list_heroes_0".equals(tag)) {
            return new ActivityListHeroesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_list_heroes is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHEROESDETAILS: {
          if ("layout/activity_heroes_details_0".equals(tag)) {
            return new ActivityHeroesDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_heroes_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHERO: {
          if ("layout/item_hero_0".equals(tag)) {
            return new ItemHeroBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_hero is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPROGRESS: {
          if ("layout/item_progress_0".equals(tag)) {
            return new ItemProgressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_progress is invalid. Received: " + tag);
        }
        case  LAYOUT_LOADINGPLACEHOLDER: {
          if ("layout/loading_placeholder_0".equals(tag)) {
            return new LoadingPlaceholderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for loading_placeholder is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "progressVisible");
      sKeys.put(2, "visible");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_list_heroes_0", com.hero.code.R.layout.activity_list_heroes);
      sKeys.put("layout/activity_heroes_details_0", com.hero.code.R.layout.activity_heroes_details);
      sKeys.put("layout/activity_splash_0", com.hero.code.R.layout.activity_splash);
      sKeys.put("layout/item_hero_0", com.hero.code.R.layout.item_hero);
      sKeys.put("layout/item_progress_0", com.hero.code.R.layout.item_progress);
      sKeys.put("layout/loading_placeholder_0", com.hero.code.R.layout.loading_placeholder);
    }
  }
}

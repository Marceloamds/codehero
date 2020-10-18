package com.hero.code;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.hero.code.databinding.ActivityCharacterDetailsBindingImpl;
import com.hero.code.databinding.ActivityListCharactersBindingImpl;
import com.hero.code.databinding.ActivitySplashBindingImpl;
import com.hero.code.databinding.FragmentShowCharacterBindingImpl;
import com.hero.code.databinding.ItemCharacterBindingImpl;
import com.hero.code.databinding.ItemProgressBindingImpl;
import com.hero.code.databinding.ItemUrlBindingImpl;
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
  private static final int LAYOUT_ACTIVITYCHARACTERDETAILS = 1;

  private static final int LAYOUT_ACTIVITYLISTCHARACTERS = 2;

  private static final int LAYOUT_ACTIVITYSPLASH = 3;

  private static final int LAYOUT_FRAGMENTSHOWCHARACTER = 4;

  private static final int LAYOUT_ITEMCHARACTER = 5;

  private static final int LAYOUT_ITEMPROGRESS = 6;

  private static final int LAYOUT_ITEMURL = 7;

  private static final int LAYOUT_LOADINGPLACEHOLDER = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hero.code.R.layout.activity_character_details, LAYOUT_ACTIVITYCHARACTERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hero.code.R.layout.activity_list_characters, LAYOUT_ACTIVITYLISTCHARACTERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hero.code.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hero.code.R.layout.fragment_show_character, LAYOUT_FRAGMENTSHOWCHARACTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hero.code.R.layout.item_character, LAYOUT_ITEMCHARACTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hero.code.R.layout.item_progress, LAYOUT_ITEMPROGRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hero.code.R.layout.item_url, LAYOUT_ITEMURL);
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
        case  LAYOUT_ACTIVITYCHARACTERDETAILS: {
          if ("layout/activity_character_details_0".equals(tag)) {
            return new ActivityCharacterDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_character_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLISTCHARACTERS: {
          if ("layout/activity_list_characters_0".equals(tag)) {
            return new ActivityListCharactersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_list_characters is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHOWCHARACTER: {
          if ("layout/fragment_show_character_0".equals(tag)) {
            return new FragmentShowCharacterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_show_character is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHARACTER: {
          if ("layout/item_character_0".equals(tag)) {
            return new ItemCharacterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_character is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPROGRESS: {
          if ("layout/item_progress_0".equals(tag)) {
            return new ItemProgressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_progress is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMURL: {
          if ("layout/item_url_0".equals(tag)) {
            return new ItemUrlBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_url is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "character");
      sKeys.put(2, "progressVisible");
      sKeys.put(3, "visible");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_character_details_0", com.hero.code.R.layout.activity_character_details);
      sKeys.put("layout/activity_list_characters_0", com.hero.code.R.layout.activity_list_characters);
      sKeys.put("layout/activity_splash_0", com.hero.code.R.layout.activity_splash);
      sKeys.put("layout/fragment_show_character_0", com.hero.code.R.layout.fragment_show_character);
      sKeys.put("layout/item_character_0", com.hero.code.R.layout.item_character);
      sKeys.put("layout/item_progress_0", com.hero.code.R.layout.item_progress);
      sKeys.put("layout/item_url_0", com.hero.code.R.layout.item_url);
      sKeys.put("layout/loading_placeholder_0", com.hero.code.R.layout.loading_placeholder);
    }
  }
}

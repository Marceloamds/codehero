package com.nyt.movies;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.nyt.movies.databinding.ActivityListMoviesBindingImpl;
import com.nyt.movies.databinding.ActivityMoviesDetailsBindingImpl;
import com.nyt.movies.databinding.ActivitySplashBindingImpl;
import com.nyt.movies.databinding.ItemMovieBindingImpl;
import com.nyt.movies.databinding.ItemProgressBindingImpl;
import com.nyt.movies.databinding.LoadingPlaceholderBindingImpl;
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
  private static final int LAYOUT_ACTIVITYLISTMOVIES = 1;

  private static final int LAYOUT_ACTIVITYMOVIESDETAILS = 2;

  private static final int LAYOUT_ACTIVITYSPLASH = 3;

  private static final int LAYOUT_ITEMMOVIE = 4;

  private static final int LAYOUT_ITEMPROGRESS = 5;

  private static final int LAYOUT_LOADINGPLACEHOLDER = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nyt.movies.R.layout.activity_list_movies, LAYOUT_ACTIVITYLISTMOVIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nyt.movies.R.layout.activity_movies_details, LAYOUT_ACTIVITYMOVIESDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nyt.movies.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nyt.movies.R.layout.item_movie, LAYOUT_ITEMMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nyt.movies.R.layout.item_progress, LAYOUT_ITEMPROGRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nyt.movies.R.layout.loading_placeholder, LAYOUT_LOADINGPLACEHOLDER);
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
        case  LAYOUT_ACTIVITYLISTMOVIES: {
          if ("layout/activity_list_movies_0".equals(tag)) {
            return new ActivityListMoviesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_list_movies is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMOVIESDETAILS: {
          if ("layout/activity_movies_details_0".equals(tag)) {
            return new ActivityMoviesDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_movies_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMOVIE: {
          if ("layout/item_movie_0".equals(tag)) {
            return new ItemMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_movie is invalid. Received: " + tag);
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
      sKeys.put("layout/activity_list_movies_0", com.nyt.movies.R.layout.activity_list_movies);
      sKeys.put("layout/activity_movies_details_0", com.nyt.movies.R.layout.activity_movies_details);
      sKeys.put("layout/activity_splash_0", com.nyt.movies.R.layout.activity_splash);
      sKeys.put("layout/item_movie_0", com.nyt.movies.R.layout.item_movie);
      sKeys.put("layout/item_progress_0", com.nyt.movies.R.layout.item_progress);
      sKeys.put("layout/loading_placeholder_0", com.nyt.movies.R.layout.loading_placeholder);
    }
  }
}

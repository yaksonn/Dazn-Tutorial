package com.yaksonn.dazntutorial.di.module;

import android.support.v4.app.Fragment;
import com.yaksonn.dazntutorial.ui.fragment.news.NewsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainActivityModule_NewsFragment$app_debug.NewsFragmentSubcomponent.class)
public abstract class MainActivityModule_NewsFragment$app_debug {
  private MainActivityModule_NewsFragment$app_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(NewsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      NewsFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = HelperModule.class)
  public interface NewsFragmentSubcomponent extends AndroidInjector<NewsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<NewsFragment> {}
  }
}

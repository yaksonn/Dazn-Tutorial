package com.yaksonn.dazntutorial.injection;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import com.yaksonn.dazntutorial.ui.fragment.scores.ScoresFragment;

@Module(
  subcomponents = MainActivityModule_ScoresFragment$app_debug.ScoresFragmentSubcomponent.class
)
public abstract class MainActivityModule_ScoresFragment$app_debug {
  private MainActivityModule_ScoresFragment$app_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(ScoresFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ScoresFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = HelperModule.class)
  public interface ScoresFragmentSubcomponent extends AndroidInjector<ScoresFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScoresFragment> {}
  }
}

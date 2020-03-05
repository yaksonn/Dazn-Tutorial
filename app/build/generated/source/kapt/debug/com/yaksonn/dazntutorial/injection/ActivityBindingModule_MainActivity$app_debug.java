package com.yaksonn.dazntutorial.injection;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import com.yaksonn.dazntutorial.ui.activity.main.MainActivity;

@Module(subcomponents = ActivityBindingModule_MainActivity$app_debug.MainActivitySubcomponent.class)
public abstract class ActivityBindingModule_MainActivity$app_debug {
  private ActivityBindingModule_MainActivity$app_debug() {}

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Builder builder);

  @Subcomponent(modules = MainActivityModule.class)
  @ActivityScope
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }
}

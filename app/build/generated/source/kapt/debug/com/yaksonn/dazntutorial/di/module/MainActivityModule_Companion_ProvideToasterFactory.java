package com.yaksonn.dazntutorial.di.module;

import android.app.Activity;
import com.yaksonn.dazntutorial.util.customviews.Toaster;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivityModule_Companion_ProvideToasterFactory implements Factory<Toaster> {
  private final MainActivityModule.Companion module;

  private final Provider<Activity> activityProvider;

  public MainActivityModule_Companion_ProvideToasterFactory(
      MainActivityModule.Companion module, Provider<Activity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public Toaster get() {
    return Preconditions.checkNotNull(
        module.provideToaster(activityProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static MainActivityModule_Companion_ProvideToasterFactory create(
      MainActivityModule.Companion module, Provider<Activity> activityProvider) {
    return new MainActivityModule_Companion_ProvideToasterFactory(module, activityProvider);
  }

  public static Toaster proxyProvideToaster(
      MainActivityModule.Companion instance, Activity activity) {
    return Preconditions.checkNotNull(
        instance.provideToaster(activity),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}

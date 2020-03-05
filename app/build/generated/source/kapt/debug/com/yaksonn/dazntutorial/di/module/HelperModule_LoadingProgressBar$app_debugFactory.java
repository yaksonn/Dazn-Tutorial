package com.yaksonn.dazntutorial.di.module;

import com.yaksonn.dazntutorial.util.customviews.LoadingProgressBar;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HelperModule_LoadingProgressBar$app_debugFactory
    implements Factory<LoadingProgressBar> {
  private final HelperModule module;

  public HelperModule_LoadingProgressBar$app_debugFactory(HelperModule module) {
    this.module = module;
  }

  @Override
  public LoadingProgressBar get() {
    return Preconditions.checkNotNull(
        module.loadingProgressBar$app_debug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static HelperModule_LoadingProgressBar$app_debugFactory create(HelperModule module) {
    return new HelperModule_LoadingProgressBar$app_debugFactory(module);
  }

  public static LoadingProgressBar proxyLoadingProgressBar$app_debug(HelperModule instance) {
    return Preconditions.checkNotNull(
        instance.loadingProgressBar$app_debug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}

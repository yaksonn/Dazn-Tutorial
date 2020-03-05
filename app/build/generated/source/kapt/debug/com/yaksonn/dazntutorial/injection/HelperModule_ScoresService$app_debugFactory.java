package com.yaksonn.dazntutorial.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import com.yaksonn.dazntutorial.networking.Api;
import com.yaksonn.dazntutorial.networking.IScoresService;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HelperModule_ScoresService$app_debugFactory implements Factory<IScoresService> {
  private final HelperModule module;

  private final Provider<Api> apiProvider;

  public HelperModule_ScoresService$app_debugFactory(
      HelperModule module, Provider<Api> apiProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
  }

  @Override
  public IScoresService get() {
    return Preconditions.checkNotNull(
        module.scoresService$app_debug(apiProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static HelperModule_ScoresService$app_debugFactory create(
      HelperModule module, Provider<Api> apiProvider) {
    return new HelperModule_ScoresService$app_debugFactory(module, apiProvider);
  }

  public static IScoresService proxyScoresService$app_debug(HelperModule instance, Api api) {
    return Preconditions.checkNotNull(
        instance.scoresService$app_debug(api),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}

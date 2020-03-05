package com.yaksonn.dazntutorial.di.module;

import com.yaksonn.dazntutorial.network.ApiServiceInterface;
import com.yaksonn.dazntutorial.network.scoresprovider.IScoresService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HelperModule_ScoresService$app_debugFactory implements Factory<IScoresService> {
  private final HelperModule module;

  private final Provider<ApiServiceInterface> apiProvider;

  public HelperModule_ScoresService$app_debugFactory(
      HelperModule module, Provider<ApiServiceInterface> apiProvider) {
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
      HelperModule module, Provider<ApiServiceInterface> apiProvider) {
    return new HelperModule_ScoresService$app_debugFactory(module, apiProvider);
  }

  public static IScoresService proxyScoresService$app_debug(
      HelperModule instance, ApiServiceInterface api) {
    return Preconditions.checkNotNull(
        instance.scoresService$app_debug(api),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}

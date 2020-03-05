package com.yaksonn.dazntutorial.di.module;

import com.yaksonn.dazntutorial.network.ApiServiceInterface;
import com.yaksonn.dazntutorial.network.newsprovider.INewsService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HelperModule_NewsService$app_debugFactory implements Factory<INewsService> {
  private final HelperModule module;

  private final Provider<ApiServiceInterface> apiProvider;

  public HelperModule_NewsService$app_debugFactory(
      HelperModule module, Provider<ApiServiceInterface> apiProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
  }

  @Override
  public INewsService get() {
    return Preconditions.checkNotNull(
        module.newsService$app_debug(apiProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static HelperModule_NewsService$app_debugFactory create(
      HelperModule module, Provider<ApiServiceInterface> apiProvider) {
    return new HelperModule_NewsService$app_debugFactory(module, apiProvider);
  }

  public static INewsService proxyNewsService$app_debug(
      HelperModule instance, ApiServiceInterface api) {
    return Preconditions.checkNotNull(
        instance.newsService$app_debug(api),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}

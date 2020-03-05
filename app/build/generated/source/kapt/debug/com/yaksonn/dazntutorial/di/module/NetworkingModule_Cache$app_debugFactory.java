package com.yaksonn.dazntutorial.di.module;

import com.yaksonn.dazntutorial.DaznApp;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkingModule_Cache$app_debugFactory implements Factory<Cache> {
  private final NetworkingModule module;

  private final Provider<DaznApp> appProvider;

  public NetworkingModule_Cache$app_debugFactory(
      NetworkingModule module, Provider<DaznApp> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public Cache get() {
    return Preconditions.checkNotNull(
        module.cache$app_debug(appProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetworkingModule_Cache$app_debugFactory create(
      NetworkingModule module, Provider<DaznApp> appProvider) {
    return new NetworkingModule_Cache$app_debugFactory(module, appProvider);
  }

  public static Cache proxyCache$app_debug(NetworkingModule instance, DaznApp app) {
    return Preconditions.checkNotNull(
        instance.cache$app_debug(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}

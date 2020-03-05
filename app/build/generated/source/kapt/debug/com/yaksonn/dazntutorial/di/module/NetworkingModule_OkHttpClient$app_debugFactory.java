package com.yaksonn.dazntutorial.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkingModule_OkHttpClient$app_debugFactory implements Factory<OkHttpClient> {
  private final NetworkingModule module;

  private final Provider<Cache> cacheProvider;

  public NetworkingModule_OkHttpClient$app_debugFactory(
      NetworkingModule module, Provider<Cache> cacheProvider) {
    this.module = module;
    this.cacheProvider = cacheProvider;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.okHttpClient$app_debug(cacheProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetworkingModule_OkHttpClient$app_debugFactory create(
      NetworkingModule module, Provider<Cache> cacheProvider) {
    return new NetworkingModule_OkHttpClient$app_debugFactory(module, cacheProvider);
  }

  public static OkHttpClient proxyOkHttpClient$app_debug(NetworkingModule instance, Cache cache) {
    return Preconditions.checkNotNull(
        instance.okHttpClient$app_debug(cache),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}

package com.yaksonn.dazntutorial.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkingModule_Retrofit$app_debugFactory implements Factory<Retrofit> {
  private final NetworkingModule module;

  private final Provider<OkHttpClient> clientProvider;

  public NetworkingModule_Retrofit$app_debugFactory(
      NetworkingModule module, Provider<OkHttpClient> clientProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.retrofit$app_debug(clientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetworkingModule_Retrofit$app_debugFactory create(
      NetworkingModule module, Provider<OkHttpClient> clientProvider) {
    return new NetworkingModule_Retrofit$app_debugFactory(module, clientProvider);
  }

  public static Retrofit proxyRetrofit$app_debug(NetworkingModule instance, OkHttpClient client) {
    return Preconditions.checkNotNull(
        instance.retrofit$app_debug(client),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}

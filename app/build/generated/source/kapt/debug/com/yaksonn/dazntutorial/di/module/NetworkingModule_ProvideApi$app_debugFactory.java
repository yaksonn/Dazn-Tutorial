package com.yaksonn.dazntutorial.di.module;

import com.yaksonn.dazntutorial.network.ApiServiceInterface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkingModule_ProvideApi$app_debugFactory
    implements Factory<ApiServiceInterface> {
  private final NetworkingModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NetworkingModule_ProvideApi$app_debugFactory(
      NetworkingModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiServiceInterface get() {
    return Preconditions.checkNotNull(
        module.provideApi$app_debug(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetworkingModule_ProvideApi$app_debugFactory create(
      NetworkingModule module, Provider<Retrofit> retrofitProvider) {
    return new NetworkingModule_ProvideApi$app_debugFactory(module, retrofitProvider);
  }

  public static ApiServiceInterface proxyProvideApi$app_debug(
      NetworkingModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(
        instance.provideApi$app_debug(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}

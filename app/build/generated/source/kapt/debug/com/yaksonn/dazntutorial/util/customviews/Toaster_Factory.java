package com.yaksonn.dazntutorial.util.customviews;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Toaster_Factory implements Factory<Toaster> {
  private final Provider<Context> contextProvider;

  public Toaster_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Toaster get() {
    return new Toaster(contextProvider.get());
  }

  public static Toaster_Factory create(Provider<Context> contextProvider) {
    return new Toaster_Factory(contextProvider);
  }
}

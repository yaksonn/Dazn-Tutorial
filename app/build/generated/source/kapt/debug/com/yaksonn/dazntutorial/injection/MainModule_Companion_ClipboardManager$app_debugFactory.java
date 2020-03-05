package com.yaksonn.dazntutorial.injection;

import android.content.ClipboardManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import com.yaksonn.dazntutorial.DaznApp;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainModule_Companion_ClipboardManager$app_debugFactory
    implements Factory<ClipboardManager> {
  private final MainModule.Companion module;

  private final Provider<DaznApp> appProvider;

  public MainModule_Companion_ClipboardManager$app_debugFactory(
      MainModule.Companion module, Provider<DaznApp> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public ClipboardManager get() {
    return Preconditions.checkNotNull(
        module.clipboardManager$app_debug(appProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static MainModule_Companion_ClipboardManager$app_debugFactory create(
      MainModule.Companion module, Provider<DaznApp> appProvider) {
    return new MainModule_Companion_ClipboardManager$app_debugFactory(module, appProvider);
  }

  public static ClipboardManager proxyClipboardManager$app_debug(
          MainModule.Companion instance, DaznApp app) {
    return Preconditions.checkNotNull(
        instance.clipboardManager$app_debug(app),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}

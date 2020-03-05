package com.yaksonn.dazntutorial.di.module;

import android.view.inputmethod.InputMethodManager;
import com.yaksonn.dazntutorial.DaznApp;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainModule_Companion_InputMethodManager$app_debugFactory
    implements Factory<InputMethodManager> {
  private final MainModule.Companion module;

  private final Provider<DaznApp> appProvider;

  public MainModule_Companion_InputMethodManager$app_debugFactory(
      MainModule.Companion module, Provider<DaznApp> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public InputMethodManager get() {
    return Preconditions.checkNotNull(
        module.inputMethodManager$app_debug(appProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static MainModule_Companion_InputMethodManager$app_debugFactory create(
      MainModule.Companion module, Provider<DaznApp> appProvider) {
    return new MainModule_Companion_InputMethodManager$app_debugFactory(module, appProvider);
  }

  public static InputMethodManager proxyInputMethodManager$app_debug(
      MainModule.Companion instance, DaznApp app) {
    return Preconditions.checkNotNull(
        instance.inputMethodManager$app_debug(app),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}

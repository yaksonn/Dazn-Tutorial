package com.yaksonn.dazntutorial;

import android.support.v4.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

import com.yaksonn.dazntutorial.ui.activity.main.MainActivity;
import com.yaksonn.dazntutorial.util.listener.INavigationManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>>
      fragmentDispatchingAndroidInjectorProvider;

  private final Provider<INavigationManager> navigationManagerProvider;

  public MainActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> fragmentDispatchingAndroidInjectorProvider,
      Provider<INavigationManager> navigationManagerProvider) {
    this.fragmentDispatchingAndroidInjectorProvider = fragmentDispatchingAndroidInjectorProvider;
    this.navigationManagerProvider = navigationManagerProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> fragmentDispatchingAndroidInjectorProvider,
      Provider<INavigationManager> navigationManagerProvider) {
    return new MainActivity_MembersInjector(
        fragmentDispatchingAndroidInjectorProvider, navigationManagerProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectFragmentDispatchingAndroidInjector(
        instance, fragmentDispatchingAndroidInjectorProvider.get());
    injectNavigationManager(instance, navigationManagerProvider.get());
  }

  public static void injectFragmentDispatchingAndroidInjector(
      MainActivity instance,
      DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector) {
    instance.fragmentDispatchingAndroidInjector = fragmentDispatchingAndroidInjector;
  }

  public static void injectNavigationManager(
      MainActivity instance, INavigationManager navigationManager) {
    instance.navigationManager = navigationManager;
  }
}

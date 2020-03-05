package com.yaksonn.dazntutorial.util;

import com.yaksonn.dazntutorial.util.listener.IFragmentNavigationSubject;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NavigationManager_Factory implements Factory<NavigationManager> {
  private final Provider<IFragmentNavigationSubject> navSubjectProvider;

  public NavigationManager_Factory(Provider<IFragmentNavigationSubject> navSubjectProvider) {
    this.navSubjectProvider = navSubjectProvider;
  }

  @Override
  public NavigationManager get() {
    return new NavigationManager(navSubjectProvider.get());
  }

  public static NavigationManager_Factory create(
      Provider<IFragmentNavigationSubject> navSubjectProvider) {
    return new NavigationManager_Factory(navSubjectProvider);
  }
}

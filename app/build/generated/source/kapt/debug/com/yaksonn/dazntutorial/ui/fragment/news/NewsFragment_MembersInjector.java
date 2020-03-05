package com.yaksonn.dazntutorial.ui.fragment.news;

import com.yaksonn.dazntutorial.network.newsprovider.INewsService;
import com.yaksonn.dazntutorial.util.customviews.Toaster;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NewsFragment_MembersInjector implements MembersInjector<NewsFragment> {
  private final Provider<INewsService> newsServiceProvider;

  private final Provider<Toaster> toasterProvider;

  public NewsFragment_MembersInjector(
      Provider<INewsService> newsServiceProvider, Provider<Toaster> toasterProvider) {
    this.newsServiceProvider = newsServiceProvider;
    this.toasterProvider = toasterProvider;
  }

  public static MembersInjector<NewsFragment> create(
      Provider<INewsService> newsServiceProvider, Provider<Toaster> toasterProvider) {
    return new NewsFragment_MembersInjector(newsServiceProvider, toasterProvider);
  }

  @Override
  public void injectMembers(NewsFragment instance) {
    injectNewsService(instance, newsServiceProvider.get());
    injectToaster(instance, toasterProvider.get());
  }

  public static void injectNewsService(NewsFragment instance, INewsService newsService) {
    instance.newsService = newsService;
  }

  public static void injectToaster(NewsFragment instance, Toaster toaster) {
    instance.toaster = toaster;
  }
}

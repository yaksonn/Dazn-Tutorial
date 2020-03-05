package com.yaksonn.dazntutorial.ui.fragment.scores;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import com.yaksonn.dazntutorial.networking.IScoresService;
import com.yaksonn.dazntutorial.util.customviews.Toaster;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ScoresFragment_MembersInjector implements MembersInjector<ScoresFragment> {
  private final Provider<IScoresService> scoresServiceProvider;

  private final Provider<Toaster> toasterProvider;

  public ScoresFragment_MembersInjector(
      Provider<IScoresService> scoresServiceProvider, Provider<Toaster> toasterProvider) {
    this.scoresServiceProvider = scoresServiceProvider;
    this.toasterProvider = toasterProvider;
  }

  public static MembersInjector<ScoresFragment> create(
      Provider<IScoresService> scoresServiceProvider, Provider<Toaster> toasterProvider) {
    return new ScoresFragment_MembersInjector(scoresServiceProvider, toasterProvider);
  }

  @Override
  public void injectMembers(ScoresFragment instance) {
    injectScoresService(instance, scoresServiceProvider.get());
    injectToaster(instance, toasterProvider.get());
  }

  public static void injectScoresService(ScoresFragment instance, IScoresService scoresService) {
    instance.scoresService = scoresService;
  }

  public static void injectToaster(ScoresFragment instance, Toaster toaster) {
    instance.toaster = toaster;
  }
}

package com.yaksonn.dazntutorial.injection;

import android.app.Activity;
import android.support.v4.app.Fragment;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;
import com.yaksonn.dazntutorial.DaznApp;
import com.yaksonn.dazntutorial.MackolikApplication_MembersInjector;
import com.yaksonn.dazntutorial.ui.activity.main.MainActivity;
import com.yaksonn.dazntutorial.MainActivity_MembersInjector;
import com.yaksonn.dazntutorial.networking.Api;
import com.yaksonn.dazntutorial.networking.INewsService;
import com.yaksonn.dazntutorial.networking.IScoresService;
import com.yaksonn.dazntutorial.ui.fragment.news.NewsFragment;
import com.yaksonn.dazntutorial.ui.fragment.news.NewsFragment_MembersInjector;
import com.yaksonn.dazntutorial.ui.fragment.scores.ScoresFragment;
import com.yaksonn.dazntutorial.ui.fragment.scores.ScoresFragment_MembersInjector;
import com.yaksonn.dazntutorial.util.listener.IFragmentNavigationSubject;
import com.yaksonn.dazntutorial.util.listener.INavigationManager;
import com.yaksonn.dazntutorial.util.NavigationManager_Factory;
import com.yaksonn.dazntutorial.util.customviews.Toaster;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private DaznApp seedInstance;

  private Provider<ActivityBindingModule_MainActivity$app_debug.MainActivitySubcomponent.Builder>
      mainActivitySubcomponentBuilderProvider;

  private Provider<DaznApp> seedInstanceProvider;

  private Provider<Cache> cache$app_debugProvider;

  private Provider<OkHttpClient> okHttpClient$app_debugProvider;

  private Provider<Retrofit> retrofit$app_debugProvider;

  private Provider<Api> provideApi$app_debugProvider;

  private DaggerApplicationComponent(Builder builder) {
    initialize(builder);
  }

  public static ApplicationComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return Collections
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            singletonMap(MainActivity.class, (Provider) mainActivitySubcomponentBuilderProvider);
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.mainActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBindingModule_MainActivity$app_debug.MainActivitySubcomponent.Builder>() {
          @Override
          public ActivityBindingModule_MainActivity$app_debug.MainActivitySubcomponent.Builder
              get() {
            return new MainActivitySubcomponentBuilder();
          }
        };
    this.seedInstanceProvider = InstanceFactory.create(builder.seedInstance);
    this.cache$app_debugProvider =
        DoubleCheck.provider(
            NetworkingModule_Cache$app_debugFactory.create(
                builder.networkingModule, seedInstanceProvider));
    this.okHttpClient$app_debugProvider =
        DoubleCheck.provider(
            NetworkingModule_OkHttpClient$app_debugFactory.create(
                builder.networkingModule, cache$app_debugProvider));
    this.retrofit$app_debugProvider =
        DoubleCheck.provider(
            NetworkingModule_Retrofit$app_debugFactory.create(
                builder.networkingModule, okHttpClient$app_debugProvider));
    this.provideApi$app_debugProvider =
        DoubleCheck.provider(
            NetworkingModule_ProvideApi$app_debugFactory.create(
                builder.networkingModule, retrofit$app_debugProvider));
    this.seedInstance = builder.seedInstance;
  }

  @Override
  public void inject(DaznApp arg0) {
    injectMackolikApplication(arg0);
  }

  @Override
  public Api api() {
    return provideApi$app_debugProvider.get();
  }

  private DaznApp injectMackolikApplication(DaznApp instance) {
    MackolikApplication_MembersInjector.injectActivityDispatchingAndroidInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    return instance;
  }

  private static final class Builder extends ApplicationComponent.Builder {
    private NetworkingModule networkingModule;

    private DaznApp seedInstance;

    @Override
    public ApplicationComponent build() {
      if (networkingModule == null) {
        this.networkingModule = new NetworkingModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(
            DaznApp.class.getCanonicalName() + " must be set");
      }
      return new DaggerApplicationComponent(this);
    }

    @Override
    public void seedInstance(DaznApp arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentBuilder
      extends ActivityBindingModule_MainActivity$app_debug.MainActivitySubcomponent.Builder {
    private MainActivity seedInstance;

    @Override
    public ActivityBindingModule_MainActivity$app_debug.MainActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl
      implements ActivityBindingModule_MainActivity$app_debug.MainActivitySubcomponent {
    private Provider<MainActivityModule_NewsFragment$app_debug.NewsFragmentSubcomponent.Builder>
        newsFragmentSubcomponentBuilderProvider;

    private Provider<MainActivityModule_ScoresFragment$app_debug.ScoresFragmentSubcomponent.Builder>
        scoresFragmentSubcomponentBuilderProvider;

    private Provider<MainActivity> seedInstanceProvider;

    private Provider<IFragmentNavigationSubject> bindNavSubject$app_debugProvider;

    private NavigationManager_Factory navigationManagerProvider;

    private Provider<INavigationManager> mainActivityNavigationManagerProvider;

    private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(2)
          .put(NewsFragment.class, (Provider) newsFragmentSubcomponentBuilderProvider)
          .put(ScoresFragment.class, (Provider) scoresFragmentSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivitySubcomponentBuilder builder) {
      this.newsFragmentSubcomponentBuilderProvider =
          new Provider<
              MainActivityModule_NewsFragment$app_debug.NewsFragmentSubcomponent.Builder>() {
            @Override
            public MainActivityModule_NewsFragment$app_debug.NewsFragmentSubcomponent.Builder
                get() {
              return new NewsFragmentSubcomponentBuilder();
            }
          };
      this.scoresFragmentSubcomponentBuilderProvider =
          new Provider<
              MainActivityModule_ScoresFragment$app_debug.ScoresFragmentSubcomponent.Builder>() {
            @Override
            public MainActivityModule_ScoresFragment$app_debug.ScoresFragmentSubcomponent.Builder
                get() {
              return new ScoresFragmentSubcomponentBuilder();
            }
          };
      this.seedInstanceProvider = InstanceFactory.create(builder.seedInstance);
      this.bindNavSubject$app_debugProvider = DoubleCheck.provider((Provider) seedInstanceProvider);
      this.navigationManagerProvider =
          NavigationManager_Factory.create(bindNavSubject$app_debugProvider);
      this.mainActivityNavigationManagerProvider =
          DoubleCheck.provider((Provider) navigationManagerProvider);
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectFragmentDispatchingAndroidInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      MainActivity_MembersInjector.injectNavigationManager(
          instance, mainActivityNavigationManagerProvider.get());
      return instance;
    }

    private final class NewsFragmentSubcomponentBuilder
        extends MainActivityModule_NewsFragment$app_debug.NewsFragmentSubcomponent.Builder {
      private HelperModule helperModule;

      private NewsFragment seedInstance;

      @Override
      public MainActivityModule_NewsFragment$app_debug.NewsFragmentSubcomponent build() {
        if (helperModule == null) {
          this.helperModule = new HelperModule();
        }
        if (seedInstance == null) {
          throw new IllegalStateException(NewsFragment.class.getCanonicalName() + " must be set");
        }
        return new NewsFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(NewsFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class NewsFragmentSubcomponentImpl
        implements MainActivityModule_NewsFragment$app_debug.NewsFragmentSubcomponent {
      private HelperModule helperModule;

      private NewsFragmentSubcomponentImpl(NewsFragmentSubcomponentBuilder builder) {
        initialize(builder);
      }

      private INewsService getINewsService() {
        return HelperModule_NewsService$app_debugFactory.proxyNewsService$app_debug(
            helperModule, DaggerApplicationComponent.this.provideApi$app_debugProvider.get());
      }

      private Toaster getToaster() {
        return new Toaster(DaggerApplicationComponent.this.seedInstance);
      }

      @SuppressWarnings("unchecked")
      private void initialize(final NewsFragmentSubcomponentBuilder builder) {
        this.helperModule = builder.helperModule;
      }

      @Override
      public void inject(NewsFragment arg0) {
        injectNewsFragment(arg0);
      }

      private NewsFragment injectNewsFragment(NewsFragment instance) {
        NewsFragment_MembersInjector.injectNewsService(instance, getINewsService());
        NewsFragment_MembersInjector.injectToaster(instance, getToaster());
        return instance;
      }
    }

    private final class ScoresFragmentSubcomponentBuilder
        extends MainActivityModule_ScoresFragment$app_debug.ScoresFragmentSubcomponent.Builder {
      private HelperModule helperModule;

      private ScoresFragment seedInstance;

      @Override
      public MainActivityModule_ScoresFragment$app_debug.ScoresFragmentSubcomponent build() {
        if (helperModule == null) {
          this.helperModule = new HelperModule();
        }
        if (seedInstance == null) {
          throw new IllegalStateException(ScoresFragment.class.getCanonicalName() + " must be set");
        }
        return new ScoresFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ScoresFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ScoresFragmentSubcomponentImpl
        implements MainActivityModule_ScoresFragment$app_debug.ScoresFragmentSubcomponent {
      private HelperModule helperModule;

      private ScoresFragmentSubcomponentImpl(ScoresFragmentSubcomponentBuilder builder) {
        initialize(builder);
      }

      private IScoresService getIScoresService() {
        return HelperModule_ScoresService$app_debugFactory.proxyScoresService$app_debug(
            helperModule, DaggerApplicationComponent.this.provideApi$app_debugProvider.get());
      }

      private Toaster getToaster() {
        return new Toaster(DaggerApplicationComponent.this.seedInstance);
      }

      @SuppressWarnings("unchecked")
      private void initialize(final ScoresFragmentSubcomponentBuilder builder) {
        this.helperModule = builder.helperModule;
      }

      @Override
      public void inject(ScoresFragment arg0) {
        injectScoresFragment(arg0);
      }

      private ScoresFragment injectScoresFragment(ScoresFragment instance) {
        ScoresFragment_MembersInjector.injectScoresService(instance, getIScoresService());
        ScoresFragment_MembersInjector.injectToaster(instance, getToaster());
        return instance;
      }
    }
  }
}

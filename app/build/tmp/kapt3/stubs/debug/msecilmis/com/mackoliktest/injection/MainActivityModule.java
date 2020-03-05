package msecilmis.com.mackoliktest.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\r\u0010\u000f\u001a\u00020\u0010H!\u00a2\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u0013H!\u00a2\u0006\u0002\b\u0014\u00a8\u0006\u0016"}, d2 = {"Lmsecilmis/com/mackoliktest/injection/MainActivityModule;", "", "()V", "bindActivity", "Landroid/app/Activity;", "activity", "Lmsecilmis/com/mackoliktest/MainActivity;", "bindActivity$app_debug", "bindNavSubject", "Lmsecilmis/com/mackoliktest/util/IFragmentNavigationSubject;", "bindNavSubject$app_debug", "mainActivityNavigationManager", "Lmsecilmis/com/mackoliktest/util/INavigationManager;", "navigationManager", "Lmsecilmis/com/mackoliktest/util/NavigationManager;", "newsFragment", "Lmsecilmis/com/mackoliktest/news/NewsFragment;", "newsFragment$app_debug", "scoresFragment", "Lmsecilmis/com/mackoliktest/scores/ScoresFragment;", "scoresFragment$app_debug", "Companion", "app_debug"})
@dagger.Module()
public abstract class MainActivityModule {
    public static final msecilmis.com.mackoliktest.injection.MainActivityModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {msecilmis.com.mackoliktest.injection.HelperModule.class})
    public abstract msecilmis.com.mackoliktest.news.NewsFragment newsFragment$app_debug();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {msecilmis.com.mackoliktest.injection.HelperModule.class})
    public abstract msecilmis.com.mackoliktest.scores.ScoresFragment scoresFragment$app_debug();
    
    @org.jetbrains.annotations.NotNull()
    @ActivityScope()
    @dagger.Binds()
    public abstract android.app.Activity bindActivity$app_debug(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.MainActivity activity);
    
    @org.jetbrains.annotations.NotNull()
    @ActivityScope()
    @dagger.Binds()
    public abstract msecilmis.com.mackoliktest.util.IFragmentNavigationSubject bindNavSubject$app_debug(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.MainActivity activity);
    
    @org.jetbrains.annotations.NotNull()
    @ActivityScope()
    @dagger.Binds()
    public abstract msecilmis.com.mackoliktest.util.INavigationManager mainActivityNavigationManager(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.util.NavigationManager navigationManager);
    
    public MainActivityModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lmsecilmis/com/mackoliktest/injection/MainActivityModule$Companion;", "", "()V", "provideToaster", "Lmsecilmis/com/mackoliktest/util/Toaster;", "activity", "Landroid/app/Activity;", "app_debug"})
    @dagger.Module()
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @ActivityScope()
        @dagger.Provides()
        public final msecilmis.com.mackoliktest.util.Toaster provideToaster(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
package msecilmis.com.mackoliktest.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lmsecilmis/com/mackoliktest/injection/HelperModule;", "", "()V", "loadingProgressBar", "Lmsecilmis/com/mackoliktest/LoadingProgressBar;", "loadingProgressBar$app_debug", "newsService", "Lmsecilmis/com/mackoliktest/networking/INewsService;", "api", "Lmsecilmis/com/mackoliktest/networking/Api;", "newsService$app_debug", "scoresService", "Lmsecilmis/com/mackoliktest/networking/IScoresService;", "scoresService$app_debug", "app_debug"})
@dagger.Module(subcomponents = {msecilmis.com.mackoliktest.injection.StaticComponent.class})
public final class HelperModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final msecilmis.com.mackoliktest.networking.INewsService newsService$app_debug(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.networking.Api api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final msecilmis.com.mackoliktest.networking.IScoresService scoresService$app_debug(@org.jetbrains.annotations.NotNull()
    msecilmis.com.mackoliktest.networking.Api api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final msecilmis.com.mackoliktest.LoadingProgressBar loadingProgressBar$app_debug() {
        return null;
    }
    
    public HelperModule() {
        super();
    }
}
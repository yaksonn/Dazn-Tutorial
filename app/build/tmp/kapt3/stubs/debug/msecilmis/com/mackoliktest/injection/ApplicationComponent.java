package msecilmis.com.mackoliktest.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lmsecilmis/com/mackoliktest/injection/ApplicationComponent;", "Ldagger/android/AndroidInjector;", "Lmsecilmis/com/mackoliktest/MackolikApplication;", "api", "Lmsecilmis/com/mackoliktest/networking/Api;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, msecilmis.com.mackoliktest.injection.ActivityBindingModule.class, msecilmis.com.mackoliktest.injection.MainModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent extends dagger.android.AndroidInjector<msecilmis.com.mackoliktest.MackolikApplication> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract msecilmis.com.mackoliktest.networking.Api api();
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lmsecilmis/com/mackoliktest/injection/ApplicationComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Lmsecilmis/com/mackoliktest/MackolikApplication;", "()V", "app_debug"})
    @dagger.Component.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<msecilmis.com.mackoliktest.MackolikApplication> {
        
        public Builder() {
            super();
        }
    }
}
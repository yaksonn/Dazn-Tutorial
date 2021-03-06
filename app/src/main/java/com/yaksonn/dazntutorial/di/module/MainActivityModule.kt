package com.yaksonn.dazntutorial.di.module

import android.app.Activity
import com.yaksonn.dazntutorial.di.scope.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import com.yaksonn.dazntutorial.ui.activity.MainActivity
import com.yaksonn.dazntutorial.ui.fragment.news.NewsFragment
import com.yaksonn.dazntutorial.ui.fragment.scores.ScoresFragment
import com.yaksonn.dazntutorial.util.listener.IFragmentNavigationSubject
import com.yaksonn.dazntutorial.util.listener.INavigationManager
import com.yaksonn.dazntutorial.util.NavigationManager
import com.yaksonn.dazntutorial.util.customviews.Toaster


/**
 * Created by @yaksonn
 */

@Module
internal abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = arrayOf(HelperModule::class))
    internal abstract fun newsFragment(): NewsFragment

    @ContributesAndroidInjector(modules = arrayOf(HelperModule::class))
    internal abstract fun scoresFragment(): ScoresFragment

    @Binds
    @ActivityScope
    internal abstract fun bindActivity(activity: MainActivity): Activity

    @Binds
    @ActivityScope
    internal abstract fun bindNavSubject(activity: MainActivity): IFragmentNavigationSubject

    @Binds
    @ActivityScope
    abstract fun mainActivityNavigationManager(navigationManager: NavigationManager): INavigationManager

    @Module
    companion object {


        @Provides
        @ActivityScope
        fun provideToaster(activity: Activity): Toaster {
            return Toaster(activity)
        }
    }

}

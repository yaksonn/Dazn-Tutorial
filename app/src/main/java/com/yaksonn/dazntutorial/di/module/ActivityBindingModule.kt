package com.yaksonn.dazntutorial.di.module


import com.yaksonn.dazntutorial.di.scope.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.yaksonn.dazntutorial.ui.activity.MainActivity

@Module
internal abstract class ActivityBindingModule {


    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    internal abstract fun mainActivity(): MainActivity
}

package com.yaksonn.dazntutorial.injection


import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.yaksonn.dazntutorial.ui.activity.main.MainActivity

@Module
internal abstract class ActivityBindingModule {


    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    internal abstract fun mainActivity(): MainActivity
}

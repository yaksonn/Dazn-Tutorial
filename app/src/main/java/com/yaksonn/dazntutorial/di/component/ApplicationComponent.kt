package com.yaksonn.dazntutorial.di.component


import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import com.yaksonn.dazntutorial.DaznApp
import com.yaksonn.dazntutorial.di.module.ActivityBindingModule
import com.yaksonn.dazntutorial.di.module.MainModule
import com.yaksonn.dazntutorial.network.ApiServiceInterface

import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AndroidSupportInjectionModule::class, ActivityBindingModule::class, MainModule::class))
interface ApplicationComponent : AndroidInjector<DaznApp> {

    fun api(): ApiServiceInterface

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DaznApp>()
}

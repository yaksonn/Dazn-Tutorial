package com.yaksonn.dazntutorial.injection


import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import com.yaksonn.dazntutorial.DaznApp
import com.yaksonn.dazntutorial.networking.Api

import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AndroidSupportInjectionModule::class, ActivityBindingModule::class, MainModule::class))
interface ApplicationComponent : AndroidInjector<DaznApp> {

    fun api(): Api

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DaznApp>()
}

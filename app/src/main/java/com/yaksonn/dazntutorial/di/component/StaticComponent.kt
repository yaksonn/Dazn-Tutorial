package com.yaksonn.dazntutorial.di.component

import com.yaksonn.dazntutorial.di.module.StaticModule
import dagger.Subcomponent


/**
 * Created by @yaksonn
 */

@Subcomponent(modules = arrayOf(StaticModule::class))
interface StaticComponent {

    @Subcomponent.Builder
    interface Builder {
        fun staticModule(staticModule: StaticModule): Builder

        fun build(): StaticComponent
    }
}

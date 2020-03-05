package com.yaksonn.dazntutorial.injection


import android.app.Activity
import android.content.ClipboardManager
import android.content.Context
import android.view.inputmethod.InputMethodManager
import dagger.Binds
import dagger.Module
import dagger.Provides
import com.yaksonn.dazntutorial.DaznApp

import javax.inject.Singleton

@Module(subcomponents = arrayOf(StaticComponent::class), includes = arrayOf(NetworkingModule::class))
abstract class MainModule {

    @Binds
    internal abstract fun provideAppContext(application: DaznApp): Context

    @Module
    companion object {
        @Provides
        @Singleton
        internal fun clipboardManager(app: DaznApp): ClipboardManager {
            return app.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        }

        @Provides
        @Singleton
        internal fun inputMethodManager(app: DaznApp): InputMethodManager {
            return app.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        }
    }

    //    @Binds
    //    @Singleton
    //    abstract INewsService newsService(NewsService authSvc);

    //    @Binds
    //    @Singleton
    //    abstract IMessagingManager provideMessagingManager(MessagingManager messagingManager);

}

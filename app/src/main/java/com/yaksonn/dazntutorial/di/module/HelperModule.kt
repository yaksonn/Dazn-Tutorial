package com.yaksonn.dazntutorial.di.module

import com.yaksonn.dazntutorial.di.component.StaticComponent
import dagger.Module
import dagger.Provides
import com.yaksonn.dazntutorial.util.customviews.LoadingProgressBar
import com.yaksonn.dazntutorial.network.*
import com.yaksonn.dazntutorial.network.newsprovider.INewsService
import com.yaksonn.dazntutorial.network.newsprovider.NewsService
import com.yaksonn.dazntutorial.network.scoresprovider.IScoresService
import com.yaksonn.dazntutorial.network.scoresprovider.ScoresService

/**
 * Created by @yaksonn
 */

@Module(subcomponents = arrayOf(StaticComponent::class))
class HelperModule {

    @Provides
    internal fun newsService(api: ApiServiceInterface): INewsService {
        return NewsService(api)
    }

    @Provides
    internal fun scoresService(api: ApiServiceInterface): IScoresService {
        return ScoresService(api)
    }

    @Provides
    internal fun loadingProgressBar(): LoadingProgressBar {
        return LoadingProgressBar()
    }

}

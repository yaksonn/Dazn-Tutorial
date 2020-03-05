package com.yaksonn.dazntutorial.injection

import dagger.Module
import dagger.Provides
import com.yaksonn.dazntutorial.util.customviews.LoadingProgressBar
import com.yaksonn.dazntutorial.networking.*

@Module(subcomponents = arrayOf(StaticComponent::class))
class HelperModule {

    @Provides
    internal fun newsService(api: Api): INewsService {
        return NewsService(api)
    }

    @Provides
    internal fun scoresService(api: Api): IScoresService {
        return ScoresService(api)
    }

    @Provides
    internal fun loadingProgressBar(): LoadingProgressBar {
        return LoadingProgressBar()
    }

}

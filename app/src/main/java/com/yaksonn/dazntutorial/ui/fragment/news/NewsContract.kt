package com.yaksonn.dazntutorial.ui.fragment.news

/**
 * Created by @yaksonn
 */

class NewsContract {

    interface View {
        fun onLoadNewsSuccess(newsViews: List<NewsItemViewModel>)
        fun onLoadNewsFail(errorMessage: String)
    }

    interface Presenter {
        fun loadNews()
    }
}
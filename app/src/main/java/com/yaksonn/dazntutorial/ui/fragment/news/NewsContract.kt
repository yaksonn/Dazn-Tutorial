package com.yaksonn.dazntutorial.ui.fragment.news

class NewsContract {

    interface View {
        fun onLoadNewsSuccess(newsViews: List<NewsItemViewModel>)
        fun onLoadNewsFail(errorMessage: String)
    }

    interface Presenter {
        fun loadNews()
    }
}
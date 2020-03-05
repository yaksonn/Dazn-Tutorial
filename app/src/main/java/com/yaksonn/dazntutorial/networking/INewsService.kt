package com.yaksonn.dazntutorial.networking

import com.yaksonn.dazntutorial.ui.fragment.news.NewsItemViewModel

interface INewsService {
    fun getNews(callback: IGetNewsCallback)

    interface IGetNewsCallback {
        fun onSuccess(newsViewModels: List<NewsItemViewModel>)

        fun onFailure(errorMessage: String)
    }
}
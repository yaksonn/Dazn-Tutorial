package com.yaksonn.dazntutorial.network.newsprovider

import com.yaksonn.dazntutorial.ui.fragment.news.NewsItemViewModel

/**
 * Created by @yaksonn
 */

interface INewsService {
    fun getNews(callback: IGetNewsCallback)

    interface IGetNewsCallback {
        fun onSuccess(newsViewModels: List<NewsItemViewModel>)

        fun onFailure(errorMessage: String)
    }
}
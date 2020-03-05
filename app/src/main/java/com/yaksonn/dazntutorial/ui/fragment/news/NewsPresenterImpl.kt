package com.yaksonn.dazntutorial.ui.fragment.news

import com.yaksonn.dazntutorial.network.newsprovider.INewsService

class NewsPresenterImpl constructor(val view: NewsContract.View, val newsService: INewsService) :
    NewsContract.Presenter {

    override fun loadNews() {
        newsService.getNews(object : INewsService.IGetNewsCallback {
            override fun onSuccess(newsViewModels: List<NewsItemViewModel>) {
                view.onLoadNewsSuccess(newsViewModels)
            }

            override fun onFailure(errorMessage: String) {
                view.onLoadNewsFail(errorMessage)
            }
        })
    }
}
package com.yaksonn.dazntutorial.ui.fragment.news

import android.text.TextUtils
import com.yaksonn.dazntutorial.network.models.NewsModel

/**
 * Created by @yaksonn
 */

class NewsItemViewModel {

    var title: String
    var pubDate: String
    var imageUrl: String
    var detailUrl: String

    constructor(title: String, pubDate: String, imageUrl: String, detailUrl: String) {
        this.title = title
        this.pubDate = pubDate
        this.imageUrl = imageUrl
        this.detailUrl = detailUrl
    }

    companion object {
        fun convert(newsItemNetworkingModels: List<NewsModel.Item>): List<NewsItemViewModel> {
            var newsItems = ArrayList<NewsItemViewModel>()
            newsItemNetworkingModels.forEach {
                var imgUrl = ""
                val enclosure = it.enclosure
                if (enclosure != null && !TextUtils.isEmpty(enclosure.url)) {
                    imgUrl = enclosure.url
                }

                newsItems.add(NewsItemViewModel(it.title, it.pubDate, imgUrl, it.link))
            }
            return newsItems
        }
    }

}
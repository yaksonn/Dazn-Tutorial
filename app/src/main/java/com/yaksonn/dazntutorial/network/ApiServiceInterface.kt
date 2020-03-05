package com.yaksonn.dazntutorial.network

import com.yaksonn.dazntutorial.network.models.NewsModel
import com.yaksonn.dazntutorial.network.models.ScoresModel
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by @yaksonn
 */

interface ApiServiceInterface {

    @get:GET(value = "latestnews.xml")
    val news: Call<NewsModel>

    @get:GET(value = "scores.xml")
    val scores: Call<ScoresModel>

}

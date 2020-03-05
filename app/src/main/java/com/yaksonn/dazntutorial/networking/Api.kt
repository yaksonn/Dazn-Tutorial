package com.yaksonn.dazntutorial.networking

import com.yaksonn.dazntutorial.networking.models.NewsModel
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @get:GET(value = "/utilities/interviews/techtest/latestnews.xml")
    val news: Call<NewsModel>

    @get:GET(value = "/utilities/interviews/techtest/scores.xml")
    val scores: Call<GetScoresResponse>

}

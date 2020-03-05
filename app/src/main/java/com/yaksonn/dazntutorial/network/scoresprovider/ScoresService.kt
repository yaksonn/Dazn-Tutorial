package com.yaksonn.dazntutorial.network.scoresprovider

import android.text.TextUtils
import android.util.Log
import com.yaksonn.dazntutorial.network.ApiServiceInterface
import com.yaksonn.dazntutorial.network.models.ScoresModel
import com.yaksonn.dazntutorial.ui.fragment.scores.ScoresItemViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by @yaksonn
 */

class ScoresService(private val api: ApiServiceInterface) :
    IScoresService {

    override fun getScores(callback: IScoresService.IGetScoresCallback) {
        api.scores.enqueue(object : Callback<ScoresModel> {
            override fun onResponse(call: Call<ScoresModel>, response: Response<ScoresModel>) {
                if (!response.isSuccessful) {
                    callback.onFailure("Response unsuccessful")
                    return
                }

                val body = response.body()
                if (body == null) {
                    callback.onFailure("Body null")
                    return
                }

                ScoresItemViewModel.convert(body)?.let { callback.onSuccess(it) }

            }

            override fun onFailure(call: Call<ScoresModel>, t: Throwable) {
                var message = t.message
                if (TextUtils.isEmpty(message) || message == null) {
                    message = "Call Failed"
                }

                callback.onFailure(message)
                Log.d("okhttp log", message)
            }
        })
    }

}
package com.yaksonn.dazntutorial.di.module

import dagger.Module
import dagger.Provides
import com.yaksonn.dazntutorial.DaznApp
import com.yaksonn.dazntutorial.network.ApiServiceInterface
import com.yaksonn.dazntutorial.util.BASE_URL
import com.yaksonn.dazntutorial.util.TIME_OUT
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Created by @yaksonn
 */

@Module
class NetworkingModule {


    /**
     * Provides [OkHttpClient] instance
     */
    @Provides
    @Singleton
    internal fun okHttpClient(cache: Cache): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        return OkHttpClient.Builder()
            .cache(cache)
            .addInterceptor(interceptor)
            .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
            .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
            .readTimeout(TIME_OUT, TimeUnit.SECONDS)
            .build()
    }


    /**
     * Provides [Retrofit] instance
     */
    @Provides
    @Singleton
    internal fun retrofit(client: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .client(client)
            .baseUrl(BASE_URL)
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    internal fun provideApi(retrofit: Retrofit): ApiServiceInterface {
        return retrofit.create(ApiServiceInterface::class.java)
    }


    @Provides
    @Singleton
    internal fun cache(app: DaznApp): Cache {
        return Cache(app.cacheDir.absoluteFile, (20 * 1024 * 1024).toLong())
    }

}

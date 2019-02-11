package com.zj.example.dagger2.example20.di.module

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

/**
 *
 * CreateTime:2019/1/29  17:18
 * @author 郑炯
 * @version 1.0
 */

@Module
class AppModule {

    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .readTimeout(15, TimeUnit.SECONDS)
                .connectTimeout(15, TimeUnit.SECONDS)
                .build()
    }

    @Provides
    fun provideUrl() = "http://www.baidu.com"

    @Provides
    fun provideRetrofit(client: OkHttpClient, url: String): Retrofit {
        return Retrofit.Builder()
                .client(client)
                .baseUrl(url)
                .build()
    }
}
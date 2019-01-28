package com.zj.example.dagger2.di.module

import com.zj.example.dagger2.MainActivity
import com.zj.example.dagger2.example3.Example3Activity
import com.zj.example.dagger2.example3.bean.Dog
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

/**
 *
 * CreateTime: 17/10/10  18:04
 * @author 郑炯
 */

@Module
class OkHttpModule() {

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
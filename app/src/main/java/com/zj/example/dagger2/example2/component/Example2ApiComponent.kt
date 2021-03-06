package com.zj.example.dagger2.example2.component

import com.zj.example.dagger2.example2.module.ApiModule
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 *
 * CreateTime: 17/10/10  13:19
 * @author 郑炯
 */

/**
 * 这里标记Singleton, 是因为ApiModule有方法使用了Singleton
 */
@Singleton
@Component(modules = arrayOf(ApiModule::class))
interface Example2ApiComponent {
    fun getRetrofit(): Retrofit
}
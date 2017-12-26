package com.zj.example.dagger2.example3.component

import com.zj.example.dagger2.MainActivity
import com.zj.example.dagger2.example3.Example3Activity
import com.zj.example.dagger2.example3.bean.Dog
import com.zj.example.dagger2.example3.module.Example3OkHttpModule
import dagger.Component
import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 * Created by zhengjiong
 * date: 2017/10/10 20:59
 */
@Component(modules = arrayOf(Example3OkHttpModule::class))
interface Example3OkHttpComponent {
    fun getRetrofit(): Retrofit

    /**
     * 如果Example3Activity中想要注入OkHttpClient对象, 这里必须要加上这个方法才行
     */
    //fun getOkHttpClient(): OkHttpClient

    /**
     * Example3Activity已经在Example3PresenterComponent中被
     * 注入了,这里如果也有会报错
     */
    //fun inject(activity: Example3Activity)

    /**
     * 重要:
     * 因为该Component是作为dependencies(依赖)而不是modules, 添加到Example3PresenterComponent中的,
     * 所以必须提供这个方法, Example3Activity才能注入Example3OkHttpModule中提供的Dog变量
     */
    fun getDog(): Dog//这里必须提供这个方法
}
package com.zj.example.dagger2.example5.di.component

import android.content.Context
import com.zj.example.dagger2.example5.Navigator
import com.zj.example.dagger2.example5.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by zhengjiong
 * date: 2017/10/15 21:03
 */

/**
 * 这里加上@Singleton后如果, AppModule中相应的方法不加@Singleton,编译是不会报错的,
 * 但是AppModule中的方法如果加了@Singletion,这里的AppComponent不加@Singleton的话,
 * 编译就会报错
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun getContext(): Context
    fun getNavigator(): Navigator
}
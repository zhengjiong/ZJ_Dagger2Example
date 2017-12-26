package com.zj.example.dagger2.example5.di.component

import android.content.Context
import com.zj.example.dagger2.example5.Navigator
import com.zj.example.dagger2.example5.ToastUtil
import com.zj.example.dagger2.example5.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by zhengjiong
 * date: 2017/10/15 21:03
 */

/**
 * AppComponet作为dependencies的时候是不能添加@Singleton的, 原因不明!
 */
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    //AppComponet作为MainComponent的dependencies, 所以这里需要提供这3个方法
    fun getContext(): Context
    fun getNavigator(): Navigator
    fun getToastUtil(): ToastUtil
}
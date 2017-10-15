package com.zj.example.dagger2.example5.di.module

import android.content.Context
import com.zj.example.dagger2.example5.Navigator
import com.zj.example.dagger2.example5.ToastUtil
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by zhengjiong
 * date: 2017/10/15 22:03
 */

@Module
class AppModule(val context: Context) {

    @Singleton
    @Provides
    fun provideContext() = context


    @Singleton
    @Provides
    fun provideNavigator() = Navigator()

    @Singleton
    @Provides
    fun provideToastUtil() = ToastUtil(context)
}
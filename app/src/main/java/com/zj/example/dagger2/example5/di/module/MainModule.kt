package com.zj.example.dagger2.example5.di.module

import com.zj.example.dagger2.example5.data.UserModle
import dagger.Module
import dagger.Provides

/**
 * Created by zhengjiong
 * date: 2017/10/16 22:35
 */
@Module
class MainModule {

    @Provides
    fun provideGetUser() = UserModle()
}
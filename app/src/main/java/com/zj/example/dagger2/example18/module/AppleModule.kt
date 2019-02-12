package com.zj.example.dagger2.example18.module

import com.zj.example.dagger2.example18.bean.Apple
import dagger.Module
import dagger.Provides

/**
 * Created by zhengjiong
 * date: 2019/2/12 15:39
 */
@Module
class AppleModule {

    @Provides
    fun provideApple(): Apple {
        return Apple("苹果-1")
    }

    @Provides
    fun provideString(): String {
        return "苹果-2"
    }
}
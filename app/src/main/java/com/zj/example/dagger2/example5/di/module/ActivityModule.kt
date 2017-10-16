package com.zj.example.dagger2.example5.di.module

import android.app.Activity
import com.zj.example.dagger2.example5.bean.MultiConstruct
import com.zj.example.dagger2.example5.scopes.PerActivity
import dagger.Module
import dagger.Provides

/**
 * Created by zhengjiong
 * date: 2017/10/15 21:21
 */

@Module
class ActivityModule(val activity: Activity) {

    //@PerActivity
    @Provides
    fun provideActivity() = activity

    //@PerActivity
    @Provides
    fun provideInt():Int = 1

    //@PerActivity
    @Provides
    fun provideString(): String = "zhengjiong1"

    //@PerActivity
    @Provides
    fun provideMultiConstruct(): MultiConstruct = MultiConstruct("zhengjiong2")

}
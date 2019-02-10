package com.zj.example.dagger2.example14.module

import com.zj.example.dagger2.example14.Example14Activity
import com.zj.example.dagger2.example14.bean.Apple
import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

/**
 * Created by zhengjiong
 * date: 2019/2/10 22:39
 */
@Module
class DrinkModule {

    @Provides
    @IntoMap
    @StringKey("A")
    fun providerApple1(): Apple {
        return Apple("apple-1")
    }

    @Provides
    @IntoMap
    @ClassKey(Example14Activity::class)
    fun providerApple2(): Apple {
        return Apple("apple-2")
    }
}
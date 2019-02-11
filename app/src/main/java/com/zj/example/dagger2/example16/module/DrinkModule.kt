package com.zj.example.dagger2.example16.module

import com.zj.example.dagger2.example16.bean.Apple
import com.zj.example.dagger2.example16.bean.Season
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

/**
 * Created by zhengjiong
 * date: 2019/2/10 22:39
 */
@Module
class DrinkModule {


    /*@Provides
    @IntoMap
    @AppleKey(Season.SPRING, 2)
    fun providerApple1(): Apple {
        return Apple("apple-SPRING")
    }*/
}
package com.zj.example.dagger2.example17.module

import com.zj.example.dagger2.example17.Presenter
import com.zj.example.dagger2.example17.PresenterImpl
import com.zj.example.dagger2.example17.bean.Apple
import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by zhengjiong
 * date: 2019/2/10 22:39
 */
@Module
class DrinkModule {

    @Provides
    fun providerApple1(): Apple {
        return Apple("apple-SPRING")
    }
}
package com.zj.example.dagger2.example12.module

import com.zj.example.dagger2.example12.bean.BananaBean
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

/**
 * Created by zhengjiong
 * date: 2019/2/10 15:06
 */

@Module
class DrinkModule {

    /**
     * 将单个元素注入到Set
     */
    @Provides
    @IntoSet
    fun providerBanana(): BananaBean {
        return BananaBean("香蕉-2")
    }


}
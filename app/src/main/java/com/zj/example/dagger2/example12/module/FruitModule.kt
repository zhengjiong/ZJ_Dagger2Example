package com.zj.example.dagger2.example12.module

import com.zj.example.dagger2.example12.bean.BananaBean
import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoSet

/**
 * Created by zhengjiong
 * date: 2019/2/10 15:06
 */

@Module
class FruitModule {

    /**
     * 将单个元素注入到Set
     */
    @Provides
    @IntoSet
    fun providerBanana(): BananaBean {
        return BananaBean("香蕉-1")
    }

    /**
     * 将子Set<T>注入到Set
     */
    @Provides
    @ElementsIntoSet
    fun providerBananaSet(): Set<BananaBean> {
        return hashSetOf<BananaBean>().apply {
            add(BananaBean("香蕉-3"))
            add(BananaBean("香蕉-4"))
        }
    }

    /**
     * 不能注入到set中,暂时不知道有没有用
     */
    @Provides
    @IntoSet
    fun providerBananaSet2(): Set<BananaBean> {
        return hashSetOf<BananaBean>().apply {
            add(BananaBean("香蕉-5"))
            add(BananaBean("香蕉-6"))
        }
    }
}
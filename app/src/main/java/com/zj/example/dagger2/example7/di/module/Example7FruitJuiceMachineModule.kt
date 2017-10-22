package com.zj.example.dagger2.example7.di.module

import com.zj.example.dagger2.example7.bean.FruitJuiceMachine
import com.zj.example.dagger2.example7.bean.Machine
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by zhengjiong
 * date: 2017/10/22 16:44
 */

@Module
class Example7FruitJuiceMachineModule {

    /**
     * 1.添加@Singleton标明该方法产生只产生一个实例
     * @Singleton来缓存“果汁榨汁机”，这样在下一次需要“果汁榨汁机” 时会直接使用上一次的缓存
      */
    @Singleton
    @Provides
    fun provideFruitJuiceMachine(): Machine {
        return FruitJuiceMachine("果汁榨汁机")
    }
}
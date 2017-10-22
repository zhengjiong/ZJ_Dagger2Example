package com.zj.example.dagger2.example8.di.module

import com.zj.example.dagger2.example8.bean.FruitJuiceMachine
import com.zj.example.dagger2.example8.bean.Machine
import com.zj.example.dagger2.example8.di.scope.PerActivity
import dagger.Module
import dagger.Provides

/**
 * Created by zhengjiong
 * date: 2017/10/22 17:18
 */

@Module
class Example8MachineModule {

    //1.添加@PerActivity标明该方法产生只产生一个实例
    @PerActivity
    @Provides
    fun provideFruitJuiceMachine(): Machine {
        return FruitJuiceMachine("水果榨汁机")
    }
}
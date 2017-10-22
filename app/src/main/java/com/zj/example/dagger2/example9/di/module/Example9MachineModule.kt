package com.zj.example.dagger2.example9.di.module

import com.zj.example.dagger2.example9.bean.FruitJuiceMachine
import com.zj.example.dagger2.example9.bean.Machine
import dagger.Module
import dagger.Provides

/**
 * Created by zhengjiong
 * date: 2017/10/22 17:18
 */

@Module
class Example9MachineModule {

    @Provides
    fun provideFruitJuiceMachine(): Machine {
        return FruitJuiceMachine("水果榨汁机")
    }
}
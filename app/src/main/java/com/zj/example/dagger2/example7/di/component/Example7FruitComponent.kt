package com.zj.example.dagger2.example7.di.component

import com.zj.example.dagger2.example7.Example7Activity
import com.zj.example.dagger2.example7.di.module.Example7FruitJuiceMachineModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by zhengjiong
 * date: 2017/10/22 16:43
 */


//添加@Singleton标明该Component中有Module使用了@Singleton
@Singleton
@Component(modules = arrayOf(Example7FruitJuiceMachineModule::class))
interface Example7FruitComponent {

    fun inject(activity: Example7Activity)
}
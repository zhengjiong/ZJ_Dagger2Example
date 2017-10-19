package com.zj.example.dagger2.example6.di.component

import com.zj.example.dagger2.example6.Example6Activity
import com.zj.example.dagger2.example6.di.module.FruitModule
import dagger.Component

/**
 *
 * CreateTime: 17/10/19  10:35
 * @author 郑炯
 */

@Component(modules = arrayOf(FruitModule::class))
interface FruitComponent{
    fun inject(activity:Example6Activity)
}
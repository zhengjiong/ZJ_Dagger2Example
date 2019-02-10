package com.zj.example.dagger2.example14.component

import com.zj.example.dagger2.example14.Example14Activity
import com.zj.example.dagger2.example14.bean.Apple
import com.zj.example.dagger2.example14.module.DrinkModule
import dagger.Component

/**
 * Created by zhengjiong
 * date: 2019/2/10 23:12
 */
@Component(modules = [DrinkModule::class])
interface DrinkComponent {
    fun inject(activity: Example14Activity)

    fun applyByString(): Map<String, Apple>

    fun appleByClass(): Map<Class<*>, Apple>
}
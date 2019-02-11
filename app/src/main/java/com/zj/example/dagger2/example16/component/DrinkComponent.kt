package com.zj.example.dagger2.example16.component

import com.zj.example.dagger2.example16.Example16Activity
import com.zj.example.dagger2.example16.bean.Apple
import com.zj.example.dagger2.example16.module.DrinkModule
import dagger.Component

/**
 * Created by zhengjiong
 * date: 2019/2/10 23:12
 */
@Component(modules = [DrinkModule::class])
interface DrinkComponent {
    fun inject(activity: Example16Activity)

    //fun getAppleMap(): Map<AppleKey, Apple>
}
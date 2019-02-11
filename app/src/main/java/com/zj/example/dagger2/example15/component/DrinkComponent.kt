package com.zj.example.dagger2.example15.component

import com.zj.example.dagger2.example15.Example15Activity
import com.zj.example.dagger2.example15.module.DrinkModule
import dagger.Component

/**
 * Created by zhengjiong
 * date: 2019/2/10 23:12
 */
@Component(modules = [DrinkModule::class])
interface DrinkComponent {
    fun inject(activity: Example15Activity)
}
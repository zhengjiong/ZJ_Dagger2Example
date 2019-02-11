package com.zj.example.dagger2.example17.component

import com.zj.example.dagger2.example17.Example17Activity
import com.zj.example.dagger2.example17.module.AbstractDrinkModule
import com.zj.example.dagger2.example17.module.DrinkModule
import dagger.Component

/**
 * Created by zhengjiong
 * date: 2019/2/10 23:12
 */
@Component(modules = [DrinkModule::class, AbstractDrinkModule::class])
interface DrinkComponent {
    fun inject(activity: Example17Activity)
}
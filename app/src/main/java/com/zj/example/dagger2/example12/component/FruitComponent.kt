package com.zj.example.dagger2.example12.component

import com.zj.example.dagger2.example12.Example12Activity
import com.zj.example.dagger2.example12.bean.BananaBean
import com.zj.example.dagger2.example12.module.DrinkModule
import com.zj.example.dagger2.example12.module.FruitModule
import dagger.Component

/**
 * Created by zhengjiong
 * date: 2019/2/10 15:21
 */

@Component(modules = [FruitModule::class, DrinkModule::class])
interface FruitComponent {

    fun inject(activity: Example12Activity)

    fun getBananas(): Set<BananaBean>
}
package com.zj.example.dagger2.example13.component

import com.zj.example.dagger2.example13.Example13Activity
import com.zj.example.dagger2.example13.bean.BananaBean
import com.zj.example.dagger2.example13.module.FruitModule
import com.zj.example.dagger2.example13.qualifier.MyQualifier
import dagger.Component

/**
 * Created by zhengjiong
 * date: 2019/2/10 15:21
 */

@Component(modules = [FruitModule::class])
interface FruitComponent {

    fun inject(activity: Example13Activity)

    @MyQualifier(3)
    fun getBananas(): Set<BananaBean>
}
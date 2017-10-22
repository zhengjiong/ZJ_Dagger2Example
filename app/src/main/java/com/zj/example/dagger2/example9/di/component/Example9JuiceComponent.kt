package com.zj.example.dagger2.example9.di.component

import com.zj.example.dagger2.example9.Example9Activity
import com.zj.example.dagger2.example9.di.module.Example9MachineModule
import dagger.Component

/**
 * Created by zhengjiong
 * date: 2017/10/22 17:21
 */

@Component(modules = arrayOf(Example9MachineModule::class))
interface Example9JuiceComponent {
    fun inject(activity: Example9Activity)
}
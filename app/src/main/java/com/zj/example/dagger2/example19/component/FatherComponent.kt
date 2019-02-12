package com.zj.example.dagger2.example19.component

import com.zj.example.dagger2.example19.Example19Activity
import com.zj.example.dagger2.example19.module.ChildModule
import com.zj.example.dagger2.example19.module.FatherModule

import dagger.Component
import dagger.Subcomponent

/**
 * Created by zhengjiong
 * date: 2019/2/12 20:49
 */
@Component(modules = arrayOf(FatherModule::class))
interface FatherComponent {
    fun buildChildComponent(): ChildComponent.Builder
}

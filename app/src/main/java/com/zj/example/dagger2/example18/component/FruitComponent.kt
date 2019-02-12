package com.zj.example.dagger2.example18.component

import com.zj.example.dagger2.example18.Example18Activity
import com.zj.example.dagger2.example18.module.FruitModule
import dagger.Component

/**
 * Created by zhengjiong
 * date: 2019/2/12 17:00
 */
@Component(modules = [FruitModule::class])
interface FruitComponent {

    //重要:
    //如果FruitModule中的subcomponents也有inject方法并且参数和这里一样, 编译就会报错
    //fun inject(activity: Example18Activity)

    //这里不提供这个方法, 也是不会编译错误的, 该方法主要是为了获取subComponent.builder而用
    fun provideAppleSubComponentBuilder(): AppleSubComponent.Builder
}
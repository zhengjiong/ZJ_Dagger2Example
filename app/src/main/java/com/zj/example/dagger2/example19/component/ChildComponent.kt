package com.zj.example.dagger2.example19.component

import com.zj.example.dagger2.example19.Example19Activity
import com.zj.example.dagger2.example19.module.ChildModule

import dagger.Subcomponent

/**
 * Created by zhengjiong
 * date: 2019/2/12 20:49
 */
@Subcomponent(modules = arrayOf(ChildModule::class))
interface ChildComponent {
    fun inject(activity: Example19Activity)

    @Subcomponent.Builder
    interface Builder {

        //Builder中必须要提供该方法不然编译会报错
        //错误: @Subcomponent.Builder types must have exactly one no-args method that  returns the @Subcomponent type
        //意思是必须提供一个无参方法并且返回一个Subcomponent类型的方法
        fun build(): ChildComponent
    }
}

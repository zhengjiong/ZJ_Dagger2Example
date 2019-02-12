package com.zj.example.dagger2.example18.component

import com.zj.example.dagger2.example18.Example18Activity
import com.zj.example.dagger2.example18.bean.Apple
import com.zj.example.dagger2.example18.module.AppleModule
import dagger.Subcomponent

/**
 * Created by zhengjiong
 * date: 2019/2/12 15:41
 */
@Subcomponent(modules = [AppleModule::class])
interface AppleSubComponent {

    fun supplyApple(): Apple
    fun supplyString(): String
    fun inject(activity: Example18Activity)


    @Subcomponent.Builder
    interface Builder {
        //Builder中必须要提供该方法不然编译会报错
        //错误: @Subcomponent.Builder types must have exactly one no-args method that  returns the @Subcomponent type
        //意思是必须提供一个无参方法并且返回一个Subcomponent类型的方法

        //编译通过
        fun build(): AppleSubComponent

        //编译错误
        //fun build2(): Int


        /**
         * 错误: @Subcomponent.Builder setter methods must return void, the builder, or a supertype of the builder
        public abstract int applyBuilder(@org.jetbrains.annotations.NotNull()

        翻译: 带参数的方法, 必须没有返回值, 或者返回为Builder类型
         */
        //编译错误
        //fun test1(module: String): Int

        //todo 开始编译通过, 后来编译错误, 暂时不知道为什么
        //fun test2(module: String): Unit

        //编译通过
        fun applyModule(module: AppleModule): Builder
    }
}
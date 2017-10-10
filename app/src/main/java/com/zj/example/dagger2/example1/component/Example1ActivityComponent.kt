package com.zj.example.dagger2.example1.component

import com.zj.example.dagger2.example1.Example1Activity
import com.zj.example.dagger2.example1.bean.User
import com.zj.example.dagger2.example1.module.Example1ActivityModule
import dagger.Component

/**
 * 我们编写的这个Component需要用@Component注解来标识，同时声明了modules为
 * 上面编写的ActivityComponent,然后提供了一个方法，叫做inject，用来在Activity中注入。
 *
 * (这里为什么要写一个方法叫做inject我暂时还没弄清楚，改名字是可以的，但是参数类型不能改，
 * 并且一定要指定module=ActivityModule才能注入)，这里我们暂且理解为提供一个方法来注入对象吧。
 *
 * CreateTime: 17/10/9  17:35
 * @author 郑炯
 */

@Component(modules = arrayOf(Example1ActivityModule::class))
interface Example1ActivityComponent {
    fun inject(activity: Example1Activity)
    fun getUser(): User
}
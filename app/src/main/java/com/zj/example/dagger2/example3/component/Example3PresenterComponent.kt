package com.zj.example.dagger2.example3.component

import com.zj.example.dagger2.example3.Example3Activity
import com.zj.example.dagger2.example3.module.Example3PresenterModule
import dagger.Component

/**
 *
 * CreateTime: 17/10/10  17:17
 * @author 郑炯
*/

@Component(modules = [Example3PresenterModule::class], dependencies = [Example3OkHttpComponent::class])
interface Example3PresenterComponent {

    /**
     * 重要:
     * 1.modules = Example3PresenterModule::class中提供的变量可以在
     * Example3Activity中直接注入, 不需要再在这里(Example3PresenterComponent)提供对应的方法
     *
     * 2.但是dependencies = arrayOf(Example3OkHttpComponent::class中对应的Module提供的变量
     * 就不能在Example3Activity中直接注入, 需要在Example3OkHttpComponent中提供相应的方法才行,比如provideDog
     */
    fun inject(activity: Example3Activity)
}
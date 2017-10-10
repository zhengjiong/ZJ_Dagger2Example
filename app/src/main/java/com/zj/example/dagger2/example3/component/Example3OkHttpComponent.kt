package com.zj.example.dagger2.example3.component

import com.zj.example.dagger2.example3.Example3Activity
import com.zj.example.dagger2.example3.module.Example3OkHttpModule
import dagger.Component

/**
 *
 * CreateTime: 17/10/10  18:09
 * @author 郑炯
 */

@Component(modules = arrayOf(Example3OkHttpModule::class))
interface Example3OkHttpComponent {
    fun inject2(example3Activity: Example3Activity)
}
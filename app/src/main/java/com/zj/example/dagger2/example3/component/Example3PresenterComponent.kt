package com.zj.example.dagger2.example3.component

import com.zj.example.dagger2.example3.Example3Activity
import com.zj.example.dagger2.example3.module.Example3PresenterModule
import dagger.Component

/**
 *
 * CreateTime: 17/10/10  17:17
 * @author 郑炯
 */

@Component(modules = arrayOf(Example3PresenterModule::class))
interface Example3PresenterComponent {
    fun inject(activity: Example3Activity)
}
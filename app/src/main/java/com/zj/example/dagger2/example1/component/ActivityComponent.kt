package com.zj.example.dagger2.example1.component

import com.zj.example.dagger2.example1.DaggerActivity
import com.zj.example.dagger2.example1.module.ActivityModule
import dagger.Component

/**
 *
 * CreateTime: 17/10/9  17:35
 * @author 郑炯
 */

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(activity: DaggerActivity)
}
package com.zj.example.dagger2.component

import com.zj.example.dagger2.example3.MainActivity
import com.zj.example.dagger2.module.MainModule
import dagger.Component

/**
 *
 * CreateTime: 17/10/9  15:59
 * @author 郑炯
 */

@Component(modules = arrayOf(MainModule::class))
interface MainComponent {
    fun inject(activity: MainActivity)
}
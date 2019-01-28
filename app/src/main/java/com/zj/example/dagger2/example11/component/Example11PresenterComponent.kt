package com.zj.example.dagger2.example11.component

import com.zj.example.dagger2.di.module.OkHttpModule
import com.zj.example.dagger2.example11.Example11Activity
import com.zj.example.dagger2.example11.module.Example11PresenterModule
import dagger.Component

/**
 *
 * CreateTime: 17/10/10  17:17
 * @author 郑炯
 */

@Component(modules = [Example11PresenterModule::class])
interface Example11PresenterComponent {


    fun inject(activity: Example11Activity)
}
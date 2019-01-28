package com.zj.example.dagger2.example10.component

import com.zj.example.dagger2.di.module.OkHttpModule
import com.zj.example.dagger2.example10.Example10Activity
import com.zj.example.dagger2.example10.module.Example10PresenterModule
import dagger.Component

/**
 *
 * CreateTime: 17/10/10  17:17
 * @author 郑炯
 */

@Component(modules = [Example10PresenterModule::class, OkHttpModule::class])
interface Example10PresenterComponent {

    /**
     * 重要:
     * 1.modules = Example10PresenterModule::class中方法需要的变量, 可以在Example10OkHttpModule中提供的话,
     * 也是可以编译通过的, 比如说Example10PresenterModule中的retrofit变量是OkHttpModule提供的
     */
    fun inject(activity: Example10Activity)
}
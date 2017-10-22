package com.zj.example.dagger2.example8.di.component

import com.zj.example.dagger2.example8.Example8Activity
import com.zj.example.dagger2.example8.di.module.Example8MachineModule
import com.zj.example.dagger2.example8.di.scope.PerActivity
import dagger.Component

/**
 * Created by zhengjiong
 * date: 2017/10/22 17:21
 */


//2.添加@PerApp标明该Component中有Module使用了@PerApp
@PerActivity
@Component(modules = arrayOf(Example8MachineModule::class))
interface JuiceComponent {
    fun inject(activity: Example8Activity)
}
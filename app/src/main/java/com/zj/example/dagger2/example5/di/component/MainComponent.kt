package com.zj.example.dagger2.example5.di.component

import com.zj.example.dagger2.example5.Example5Activity
import com.zj.example.dagger2.example5.Example5Fragment
import com.zj.example.dagger2.example5.di.module.ActivityModule
import com.zj.example.dagger2.example5.di.module.MainModule
import dagger.Component

/**
 *
 * CreateTime: 17/10/16  11:19
 * @author zhengjiong
 */
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class, MainModule::class))
interface MainComponent {
    fun inject(activityExample5: Example5Activity)
    fun plusMainFragmentComponent(module: MainFragmentModule): MainFragmentComponent
    //fun getX():Int
}
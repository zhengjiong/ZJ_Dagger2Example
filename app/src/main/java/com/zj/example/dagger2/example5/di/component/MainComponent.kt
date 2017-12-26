package com.zj.example.dagger2.example5.di.component

import com.zj.example.dagger2.example5.Example5Activity
import com.zj.example.dagger2.example5.Example5Fragment
import com.zj.example.dagger2.example5.di.module.ActivityModule
import com.zj.example.dagger2.example5.di.module.MainModule
import dagger.Component
import javax.inject.Singleton

/**
 * 这里加上@Singleton后如果, ActivityModule和MainModule中相应的方法不加@Singleton,编译是不会报错的,
 * 但是ActivityModule和MainModule中的方法如果加了@Singletion,这里的MainComponent不加@Singleton的话,
 * 编译就会报错
 *
 * CreateTime: 17/10/16  11:19
 * @author zhengjiong
 */
//@Singleton
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class, MainModule::class))
interface MainComponent {
    fun inject(activityExample5: Example5Activity)
    fun plusMainFragmentComponent(module: MainFragmentModule): MainFragmentComponent
    //fun getX():Int
}
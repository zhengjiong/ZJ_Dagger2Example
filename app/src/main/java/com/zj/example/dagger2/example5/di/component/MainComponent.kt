package com.zj.example.dagger2.example5.di.component

import com.zj.example.dagger2.example5.Example5Activity
import com.zj.example.dagger2.example5.Example5Fragment
import com.zj.example.dagger2.example5.di.module.ActivityModule
import com.zj.example.dagger2.example5.scopes.PerActivity
import dagger.Component

/**
 *
 * CreateTime: 17/10/16  11:19
 * @author 郑炯
 */
@PerActivity
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
interface MainComponent {
    fun inject(activityExample5: Example5Activity)
    fun inject(fragmentExample5: Example5Fragment)
    fun plusMainFragmentComponent(): MainFragmentComponent
    //fun getX():Int
}
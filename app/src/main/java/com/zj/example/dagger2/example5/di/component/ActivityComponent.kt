package com.zj.example.dagger2.example5.di.component

import android.app.Activity
import com.zj.example.dagger2.example5.Example5Activity
import com.zj.example.dagger2.example5.di.module.ActivityModule
import com.zj.example.dagger2.example5.scopes.PerActivity
import dagger.Component

/**
 * Created by zhengjiong
 * date: 2017/10/15 21:46
 */
@PerActivity
@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    //fun getActivity(): Activity//ActivityModule中已经提供了,这里可以不用加, 如果ActivityComponent作为dependencies才需要加
    fun inject(activity: Example5Activity)
}
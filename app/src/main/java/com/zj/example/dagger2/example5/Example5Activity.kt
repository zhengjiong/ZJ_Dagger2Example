package com.zj.example.dagger2.example5

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.example5.di.component.ActivityComponent
import com.zj.example.dagger2.example5.di.component.DaggerActivityComponent
import com.zj.example.dagger2.example5.di.module.ActivityModule
import javax.inject.Inject

/**
 * Created by zhengjiong
 * date: 2017/10/15 21:01
 */


class Example5Activity : AppCompatActivity() {

    @Inject
    lateinit var activity: Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var activityComponent: ActivityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .build()

        activityComponent.inject(this)


        println(activity?.localClassName)
    }


}
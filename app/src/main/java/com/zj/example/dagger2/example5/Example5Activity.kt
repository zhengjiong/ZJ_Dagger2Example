package com.zj.example.dagger2.example5

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.App
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example5.di.component.ActivityComponent
import com.zj.example.dagger2.example5.di.component.DaggerActivityComponent
import com.zj.example.dagger2.example5.di.component.DaggerMainComponent
import com.zj.example.dagger2.example5.di.component.MainComponent
import com.zj.example.dagger2.example5.di.module.ActivityModule
import javax.inject.Inject

/**
 * Created by zhengjiong
 * date: 2017/10/15 21:01
 */


class Example5Activity : AppCompatActivity() {

    @Inject
    lateinit var activity: Activity

    lateinit var mainComponent: MainComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example5_layout)

        /**
         * 测试注入activity
         */
        var activityComponent: ActivityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .build()
        activityComponent.inject(this)
        println(activity?.localClassName)


        /**
         * 获取MainComponent,以便MainFragment中获取MainFragmentComponent
         */
        mainComponent = DaggerMainComponent.builder()
                .appComponent(App.app.mAppComponent)
                .activityModule(ActivityModule(this))
                .build()

        supportFragmentManager.beginTransaction()
                .replace(R.id.frame_holder, Example5Fragment.newInstance(), "Example5Fragment")
                .commitAllowingStateLoss()



    }
}

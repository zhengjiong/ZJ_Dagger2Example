package com.zj.example.dagger2

import android.app.Application
import com.zj.example.dagger2.example5.di.component.AppComponent
import com.zj.example.dagger2.example5.di.component.DaggerAppComponent
import com.zj.example.dagger2.example5.di.module.AppModule

/**
 * Created by zhengjiong
 * date: 2017/10/15 21:01
 */

open class App : Application() {

    lateinit var mAppComponent: AppComponent

    companion object {
        lateinit var app: App
    }

    override fun onCreate() {
        super.onCreate()
        app = this

        mAppComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()

        println(mAppComponent?.javaClass.name)
    }
}
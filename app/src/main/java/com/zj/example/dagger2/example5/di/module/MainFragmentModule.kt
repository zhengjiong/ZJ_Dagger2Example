package com.zj.example.dagger2.example5.di.module

import com.zj.example.dagger2.example5.Example5Presenter
import com.zj.example.dagger2.example5.bean.User
import com.zj.example.dagger2.example5.contract.Example5Contract
import com.zj.example.dagger2.example5.data.UserModle
import dagger.Module
import dagger.Provides

/**
 * Created by zhengjiong
 * date: 2017/10/17 22:13
 */
@Module
class MainFragmentModule(val view: Example5Contract.View) {

    @Provides
    fun provideView(): Example5Contract.View = view

    @Provides
    fun provideX():Long = 1L
}
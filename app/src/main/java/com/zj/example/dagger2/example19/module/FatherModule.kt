package com.zj.example.dagger2.example19.module

import com.zj.example.dagger2.example19.bean.Child
import com.zj.example.dagger2.example19.bean.Father
import com.zj.example.dagger2.example19.component.ChildComponent

import dagger.Module
import dagger.Provides

/**
 * Created by zhengjiong
 * date: 2019/2/12 20:48
 */
@Module(subcomponents = arrayOf(ChildComponent::class))
class FatherModule {

    @Provides
    fun provideFather(): Father {
        return Father("father-1")
    }
}

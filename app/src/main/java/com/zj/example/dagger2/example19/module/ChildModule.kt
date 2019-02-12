package com.zj.example.dagger2.example19.module

import com.zj.example.dagger2.example19.bean.Child
import com.zj.example.dagger2.example19.bean.Father

import dagger.Module
import dagger.Provides

/**
 * Created by zhengjiong
 * date: 2019/2/12 20:48
 */
@Module
class ChildModule {

    @Provides
    fun provideChild(father: Father): Child {
        return Child(father)
    }
}

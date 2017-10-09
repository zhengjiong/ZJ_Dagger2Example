package com.zj.example.dagger2.example1.module

import com.zj.example.dagger2.example1.DaggerActivity
import com.zj.example.dagger2.example1.bean.DaggerPresenter
import com.zj.example.dagger2.example1.bean.User
import dagger.Module
import dagger.Provides

/**
 * 首先我们需要明确一个点，就是Module的作用是用来提供生成依赖对象的，
 * 比如我要注入DaggerPresenter，那么这个Module的作用就是需要生成
 * 一个DaggerPresenter的对象，来让Dagger2注入到DaggerActivity中。
 *
 * CreateTime: 17/10/9  17:23
 * @author 郑炯
 */

@Module
class ActivityModule(val activity: DaggerActivity) {

    @Provides
    fun provideActivity(): DaggerActivity = activity

    @Provides
    fun provideUser(): User = User("zhengjiong")

    @Provides
    fun provideDaggerPresenter(activity: DaggerActivity, user: User): DaggerPresenter = DaggerPresenter(activity, user)
}
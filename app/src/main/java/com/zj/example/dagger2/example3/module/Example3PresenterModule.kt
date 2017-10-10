package com.zj.example.dagger2.example3.module

import com.zj.example.dagger2.example3.Example3Activity
import com.zj.example.dagger2.example3.Example3Presenter
import com.zj.example.dagger2.example3.bean.Cat
import dagger.Module
import dagger.Provides

/**
 *
 * CreateTime: 17/10/10  17:12
 * @author 郑炯
 */
@Module
class Example3PresenterModule(val activity: Example3Activity, val cat: Cat) {

    @Provides
    fun provideActivity(): Example3Activity = this.activity

    @Provides
    fun provideCat(): Cat = cat

    @Provides
    fun providePresenter(activity: Example3Activity, cat: Cat): Example3Presenter {
        return Example3Presenter(activity, cat)
    }
}
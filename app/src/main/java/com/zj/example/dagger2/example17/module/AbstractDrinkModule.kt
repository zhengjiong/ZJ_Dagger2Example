package com.zj.example.dagger2.example17.module

import com.zj.example.dagger2.example17.Presenter
import com.zj.example.dagger2.example17.PresenterImpl
import dagger.Binds
import dagger.Module

/**
 * Created by zhengjiong
 * date: 2019/2/11 17:47
 */
@Module
abstract class AbstractDrinkModule {
    /**
     * 这里必须声明成抽象方法, 如果是kotlin必须提出来写在一个单独的class中, java的话其他provide方法必须写成static
     */
    @Binds
    abstract fun getPresenter(impl: PresenterImpl): Presenter
}
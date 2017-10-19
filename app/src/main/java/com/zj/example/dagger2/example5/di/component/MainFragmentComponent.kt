package com.zj.example.dagger2.example5.di.component

import com.zj.example.dagger2.example5.Example5Fragment
import com.zj.example.dagger2.example5.contract.Example5Contract
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

/**
 *
 * CreateTime: 17/10/16  12:31
 * @author 郑炯
 */

@Subcomponent(modules = arrayOf(MainFragmentModule::class))
interface MainFragmentComponent {
    fun inject(example5Fragment: Example5Fragment)
}

@Module
class MainFragmentModule(val view: Example5Contract.View) {

    @Provides
    fun provideView(): Example5Contract.View = view

    /*@Provides
    fun provideX():Long = 1L*/
}
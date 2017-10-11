package com.zj.example.dagger2.example4.module

import com.zj.example.dagger2.example4.Example4Contract
import dagger.Module
import dagger.Provides

/**
 *
 * CreateTime: 17/10/11  10:40
 * @author 郑炯
 */

@Module
class Example4Module(val view: Example4Contract.View) {

    @Provides
    fun provideView(): Example4Contract.View = view
}
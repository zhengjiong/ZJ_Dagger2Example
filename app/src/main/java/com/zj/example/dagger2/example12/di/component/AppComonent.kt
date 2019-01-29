package com.zj.example.dagger2.example12.di.component

import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 *
 * CreateTime:2019/1/29  17:17
 * @author 郑炯
 * @version 1.0
 */

@Component(modules = [
    AndroidInjectionModule::class,
Appmodule
])
interface AppComonent {
}
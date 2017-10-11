package com.zj.example.dagger2.example4.component

import com.zj.example.dagger2.example4.Example4Activity
import com.zj.example.dagger2.example4.module.Example4Module
import dagger.Component

/**
 *
 * CreateTime: 17/10/11  10:42
 * @author 郑炯
 */

@Component(modules = arrayOf(Example4Module::class))
interface Example4Component {
    fun inject(example4Activity: Example4Activity)
}
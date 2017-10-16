package com.zj.example.dagger2.example5.di.component

import com.zj.example.dagger2.example5.Example5Fragment
import dagger.Subcomponent

/**
 *
 * CreateTime: 17/10/16  12:31
 * @author 郑炯
 */

//@PerActivity 加了会编译不通过
@Subcomponent
interface MainFragmentComponent {
    fun inject(example5Fragment: Example5Fragment)
}
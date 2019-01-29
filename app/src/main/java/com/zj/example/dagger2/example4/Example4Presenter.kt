package com.zj.example.dagger2.example4

import javax.inject.Inject

/**
 *
 * CreateTime: 17/10/11  10:36
 * @author 郑炯
 */

//如果module没有提供Example4Presenter, 就会去查找标记了@inject的构造方法,如果构造方法的参数module可以提供那也可以注入该对象
class Example4Presenter @Inject constructor(val view: Example4Contract.View) {

    fun loadData() {
        view.updateUI("hello world")
    }
}
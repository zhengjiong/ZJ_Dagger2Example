package com.zj.example.dagger2.example4

import javax.inject.Inject

/**
 *
 * CreateTime: 17/10/11  10:36
 * @author 郑炯
 */


class Example4Presenter @Inject constructor(val view: Example4Contract.View) {

    fun loadData() {
        view.updateUI("hello world")
    }
}
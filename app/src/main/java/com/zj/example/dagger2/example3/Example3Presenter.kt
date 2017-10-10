package com.zj.example.dagger2.example3

import com.zj.example.dagger2.example3.bean.Cat

/**
 *
 * CreateTime: 17/10/10  17:06
 * @author 郑炯
 */


class Example3Presenter(val activity: Example3Activity, val cat: Cat) {

    fun sayHello() {
        activity.hello(cat.name)
    }
}
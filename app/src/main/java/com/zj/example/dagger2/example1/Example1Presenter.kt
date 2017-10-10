package com.zj.example.dagger2.example1.bean

import com.zj.example.dagger2.example1.Example1Activity

/**
 *
 * CreateTime: 17/10/9  17:18
 * @author 郑炯
 */

/**
 * DaggerPresenter实例化需要两个参数, 所以ActivityModule也需要一个这两个
 * 参数的一个函数,见:Example1ActivityModule.ktodule.kt
 */
class Example1Presenter(val activity: Example1Activity, var user: User) {
    fun showUsername(){
        activity.showUserName(user.name)
    }
}
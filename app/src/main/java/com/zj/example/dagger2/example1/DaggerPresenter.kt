package com.zj.example.dagger2.example1.bean

import com.zj.example.dagger2.example1.DaggerActivity

/**
 *
 * CreateTime: 17/10/9  17:18
 * @author 郑炯
 */

class DaggerPresenter(val activity: DaggerActivity, var user: User) {
    fun showUsername(){
        activity.showUserName(user.name)
    }
}
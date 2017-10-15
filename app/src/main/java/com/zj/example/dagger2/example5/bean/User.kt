package com.zj.example.dagger2.example5.bean

import javax.inject.Inject

/**
 * Created by zhengjiong
 * date: 2017/10/15 16:47
 */

class User @Inject constructor() {
    lateinit var username: String

    fun getUser(): User {
        var user = User()
        user.username = "zhengjiong"
        return user
    }
}
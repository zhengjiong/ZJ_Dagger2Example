package com.zj.example.dagger2.example5.data

import com.zj.example.dagger2.example5.bean.User
import javax.inject.Inject

/**
 * Created by zhengjiong
 * date: 2017/10/15 21:11
 */
class UserModle @Inject constructor() {

    fun getUser(): User {
        return User("zhengjiong")
    }
}
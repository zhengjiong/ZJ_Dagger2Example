package com.zj.example.dagger2.example5

import com.zj.example.dagger2.example5.contract.Example5Contract
import com.zj.example.dagger2.example5.data.UserModle
import javax.inject.Inject

/**
 * Created by zhengjiong
 * date: 2017/10/15 21:09
 */
class Example5Presenter @Inject constructor(val x: Int, val userModle: UserModle) : Example5Contract.Presenter {
    //val view: Example5Contract.View,

    override fun loadData() {
        val user = userModle.getUser()

    }

}
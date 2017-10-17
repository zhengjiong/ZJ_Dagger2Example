package com.zj.example.dagger2.example5.contract

/**
 * Created by zhengjiong
 * date: 2017/10/17 21:14
 */

interface Example5Contract {

    interface View {
        fun setUsername(username: String)
    }

    interface Presenter {
        fun loadData()
    }
}

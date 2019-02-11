package com.zj.example.dagger2.example17

import com.zj.example.dagger2.example17.bean.Apple
import javax.inject.Inject

/**
 * Created by zhengjiong
 * date: 2019/2/11 17:27
 */
class PresenterImpl @Inject constructor(val apple: Apple) : Presenter {

    override fun getDrink() {
        println("getDrink -> $apple")
    }
}
package com.zj.example.dagger2.example11

import android.widget.Toast
import com.zj.example.dagger2.App
import com.zj.example.dagger2.example11.bean.Dog
import retrofit2.Retrofit
import javax.inject.Inject

/**
 *
 * CreateTime: 17/10/10  17:06
 * @author 郑炯
 */


class Example11Presenter @Inject constructor(val retrofit: Retrofit, val dog: Dog) {

    fun sayHello() {
        println("sayHello " + dog.name)
        Toast.makeText(App.app, "sayHello " + dog.name, Toast.LENGTH_LONG).show()
    }
}
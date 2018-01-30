package com.zj.example.dagger2.example2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.example2.component.DaggerExample2ApiComponent
import com.zj.example.dagger2.example2.component.Example2ApiComponent
import com.zj.example.dagger2.example2.module.ApiModule

/**
 *
 * CreateTime: 17/10/10  13:09
 * @author 郑炯
 */
class Example2Activity : AppCompatActivity() {

    lateinit var apiComponent: Example2ApiComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         * 这样可以构建一个ApiComponent, 可以调用其中的方法
         */
        apiComponent = DaggerExample2ApiComponent.builder()
                .apiModule(ApiModule())
                .build()

        apiComponent.getRetrofit()
    }
}
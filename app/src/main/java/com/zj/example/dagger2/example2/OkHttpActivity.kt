package com.zj.example.dagger2.example2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.example2.component.ApiComponent
import com.zj.example.dagger2.example2.component.DaggerApiComponent
import com.zj.example.dagger2.example2.module.ApiModule

/**
 *
 * CreateTime: 17/10/10  13:09
 * @author 郑炯
 */
class OkHttpActivity : AppCompatActivity() {

    lateinit var apiComponent: ApiComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         * 这样可以构建一个ApiComponent, 可以调用其中的方法
         */
        apiComponent = DaggerApiComponent.builder()
                .apiModule(ApiModule())
                .build()


    }
}
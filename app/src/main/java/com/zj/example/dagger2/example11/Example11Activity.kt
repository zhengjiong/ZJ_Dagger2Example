package com.zj.example.dagger2.example11

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.example11.component.DaggerExample11PresenterComponent
import javax.inject.Inject

/**
 *
 * CreateTime:2019/1/28  17:12
 * @author 郑炯
 * @version 1.0
 */
class Example11Activity : AppCompatActivity() {

    @Inject
    lateinit var presenter: Example11Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        DaggerExample11PresenterComponent.create().inject(this)

        presenter.sayHello()
    }
}
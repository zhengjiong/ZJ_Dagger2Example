package com.zj.example.dagger2.example10

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example10.component.DaggerExample10PresenterComponent
import kotlinx.android.synthetic.main.activity_example10_layout.*
import javax.inject.Inject

/**
 *
 * CreateTime:2019/1/28  16:05
 * @author 郑炯
 * @version 1.0
 */
class Example10Activity : AppCompatActivity() {

    @Inject
    lateinit var presenter: Example10Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example10_layout)

        DaggerExample10PresenterComponent.create().inject(this)

        presenter.sayHello()

        button.setOnClickListener {
            presenter.sayHello()
        }
    }
}
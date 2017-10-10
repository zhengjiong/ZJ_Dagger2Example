package com.zj.example.dagger2.example3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example3.bean.Cat
import com.zj.example.dagger2.example3.component.DaggerExample3PresenterComponent
import com.zj.example.dagger2.example3.module.Example3PresenterModule
import kotlinx.android.synthetic.main.activity_example3_layout.*
import javax.inject.Inject

/**
 *
 * CreateTime: 17/10/10  16:49
 * @author 郑炯
 */
class Example3Activity : AppCompatActivity() {

    @Inject
    lateinit var presenter: Example3Presenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example3_layout)

        val component = DaggerExample3PresenterComponent.builder()
                .example3PresenterModule(Example3PresenterModule(this, Cat("黑娃")))
                .build()

        component.inject(this)

        presenter.sayHello()
    }

    fun hello(name: String) {
        textView.text = name
    }
}
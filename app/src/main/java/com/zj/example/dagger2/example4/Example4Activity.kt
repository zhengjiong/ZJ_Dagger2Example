package com.zj.example.dagger2.example4

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example4.component.DaggerExample4Component
import com.zj.example.dagger2.example4.module.Example4Module
import kotlinx.android.synthetic.main.activity_example4_layout.*
import javax.inject.Inject

/**
 *
 * CreateTime: 17/10/11  10:33
 * @author 郑炯
 */


class Example4Activity : AppCompatActivity(), Example4Contract.View {
    @Inject
    lateinit var presenter: Example4Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example4_layout)

        DaggerExample4Component.builder()
                .example4Module(Example4Module(this))
                .build()
                .inject(this)

        presenter.loadData()
    }


    override fun updateUI(content: String) {
        tvTitle.text = content
    }
}
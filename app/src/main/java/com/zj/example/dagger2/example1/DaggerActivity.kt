package com.zj.example.dagger2.example1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example1.bean.DaggerPresenter
import com.zj.example.dagger2.example1.component.DaggerActivityComponent
import com.zj.example.dagger2.example1.module.ActivityModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 *
 * CreateTime: 17/10/9  17:18
 * @author 郑炯
 */

class DaggerActivity : AppCompatActivity() {
    @Inject
    lateinit var presenter: DaggerPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //注入DaggerPresenter
        DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .build()
                .inject(this)

        presenter.showUsername()
    }

    fun showUserName(name: String) {
        text.text = name
    }
}
package com.zj.example.dagger2.example3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zj.example.dagger2.R
import com.zj.example.dagger2.presenter.MainPresenter
import com.zj.example.dagger2.view.MainContract
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View {
    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //实例化presenter 将view传递给presenter
        mainPresenter = MainPresenter(this)


        //调用Presenter方法加载数据
        mainPresenter.loadData()
    }

    override fun updateUI() {

    }
}

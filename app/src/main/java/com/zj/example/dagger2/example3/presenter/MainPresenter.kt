package com.zj.example.dagger2.presenter

import com.zj.example.dagger2.view.MainContract
import javax.inject.Inject

/**
 *
 * CreateTime: 17/10/9  15:25
 * @author 郑炯
 */

class MainPresenter @Inject constructor(val view: MainContract.View) {
    //MainContract是个接口，View是他的内部接口，这里看做View接口即可

    fun loadData(){
        //调用model层方法，加载数据
        //...
        //回调方法成功时

        view.updateUI()
    }
}
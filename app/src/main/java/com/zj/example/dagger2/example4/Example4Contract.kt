package com.zj.example.dagger2.example4

/**
 *
 * CreateTime: 17/10/11  10:37
 * @author 郑炯
 */


interface Example4Contract {
    interface View {
        fun updateUI(content: String)
    }

    interface Presenter {
        fun start()
    }
}
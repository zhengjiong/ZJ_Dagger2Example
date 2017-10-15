package com.zj.example.dagger2.example5

import android.content.Context
import android.widget.Toast

/**
 * Created by zhengjiong
 * date: 2017/10/15 22:10
 */

class ToastUtil(val context: Context) {

    fun showToast(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}
package com.zj.example.dagger2.example9

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.example9.bean.Machine
import com.zj.example.dagger2.example9.di.component.DaggerExample9JuiceComponent
import dagger.Lazy
import javax.inject.Inject
import javax.inject.Provider

/**
 *
 * Lazy和Provider都是用于包装Container中需要被注入的类型，
 * Lazy用于延迟加载，Provide用于强制重新加载
 *
 *
 * Created by zhengjiong
 * date: 2017/10/22 16:58
 */
class Example9Activity : AppCompatActivity() {

    @Inject
    lateinit var fruitJuiceMachine1: Lazy<Machine>//注入Lazy元素

    @Inject
    lateinit var fruitJuiceMachine2: Provider<Machine>//注入Lazy元素

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerExample9JuiceComponent.builder().build().inject(this)


        /**
         * 在这时才创建fruitJuiceMachine1,以后每次调用get会得到同一
         * 个fruitJuiceMachine1对象
         */
        println(fruitJuiceMachine1.get().hashCode())//166363463
        println(fruitJuiceMachine1.get().hashCode())//166363463

        println("------------------------------------")
        /**
         * 在这时创建fruitJuiceMachine2，以后每次调用get会再强制调用Module的Provides方法一次，
         * 根据Provides方法具体实现的不同，可能返回跟f2是同一个对象，也可能不是。
         */
        println(fruitJuiceMachine2.get().hashCode())//2547060
        println(fruitJuiceMachine2.get().hashCode())//62771869
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
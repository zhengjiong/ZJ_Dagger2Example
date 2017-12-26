package com.zj.example.dagger2.example7

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example7.bean.Machine
import com.zj.example.dagger2.example7.di.component.DaggerExample7FruitComponent
import kotlinx.android.synthetic.main.activity_example7_layout.*
import javax.inject.Inject

/**
 * Java中，单例通常保存在一个静态域中，这样的单例往往要等到虚拟机关闭时候，
 * 该单例所占用的资源才释放。但是，Dagger通过Singleton创建出来的单例并不
 * 保持在静态域上，而是保留在Component实例中
 *
 * Created by zhengjiong
 * date: 2017/10/22 16:40
 */
class Example7Activity : AppCompatActivity() {

    @Inject
    lateinit var fruitJuice1: Machine

    @Inject
    lateinit var fruitJuice2: Machine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example7_layout)


        DaggerExample7FruitComponent.builder().build().inject(this)

        println("${fruitJuice1.name} | hashCode=${fruitJuice1.hashCode()}")
        println("${fruitJuice2.name} | hashCode=${fruitJuice2.hashCode()}")
        println("hashCode一样表示是同一个对象, 单例成功!")


        button.setOnClickListener {
            //这样重新启动一个Example7Activity之后, 因为DaggerExample7FruitComponent又重新build, 就会又重新升一个对象,
            //所以第二个Example7Activity中的变量和第一次启动的变量已经不是同一个对象了
            //所以要达到单例的效果因为把component放到application中
            startActivity(Intent(this, Example7Activity::class.java))
        }
    }
}
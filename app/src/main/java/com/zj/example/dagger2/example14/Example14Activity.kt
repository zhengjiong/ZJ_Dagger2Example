package com.zj.example.dagger2.example14

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example14.component.DaggerDrinkComponent
import com.zj.example.dagger2.example14.component.DrinkComponent
import javax.inject.Inject
import com.zj.example.dagger2.example14.bean.Apple


/**
 * Created by zhengjiong
 * date: 2019/2/10 22:31
 */
class Example14Activity : AppCompatActivity() {

    @Inject
    lateinit var appleByString: Map<String, Apple>
    @Inject
    lateinit var appleByClass: Map<Class<*>, Apple>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example14_layout)

        val component: DrinkComponent = DaggerDrinkComponent.create()
        component.inject(this)


        //appleByString = [A]
        println("appleByString = ${appleByString.keys}")

        //appleByClass = [class com.zj.example.dagger2.example14.Example14Activity]
        println("appleByClass = ${appleByClass.keys}")

        //appleByString = [A]
        println("applyByString = ${component.applyByString().keys}")

        //appleByClass = [class com.zj.example.dagger2.example14.Example14Activity]
        println("appleByClass = ${component.appleByClass()}.keys")

    }
}
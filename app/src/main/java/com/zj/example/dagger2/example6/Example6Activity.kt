package com.zj.example.dagger2.example6

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example6.bean.Fruit
import com.zj.example.dagger2.example6.di.component.DaggerFruitComponent
import javax.inject.Inject
import javax.inject.Named

/**
 *
 * CreateTime: 17/10/19  10:20
 * @author 郑炯
 */

class Example6Activity : AppCompatActivity() {

    /**
     * kotlin注入带Named的变量需要用这种方式, java方式看Example6JavaActivity
     */
    @field:[Inject Named("apple")]
    lateinit var apple: Fruit


    @field:[Inject Named("banana")]
    lateinit var banana: Fruit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example6_layout)

        DaggerFruitComponent.create().inject(this)
        println(apple.color)
        println(banana.color)
    }
}


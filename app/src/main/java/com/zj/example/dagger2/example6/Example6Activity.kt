package com.zj.example.dagger2.example6

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example6.bean.Fruit
import com.zj.example.dagger2.example6.di.component.DaggerFruitComponent
import com.zj.example.dagger2.example6.di.qualifier.IntName
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

    /**
     * 如果觉得@Named只能用字符串区分不满足需求，也可以自定义类似@Named的注解，
     * 使用元注解@Qualifier可以实现这种注解，比如实现一个用int类型区分的@IntName
     */
    @field:[Inject IntName(9)]
    lateinit var orange: Fruit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example6_layout)

        DaggerFruitComponent.create().inject(this)
        println(apple.color)
        println(banana.color)
    }
}


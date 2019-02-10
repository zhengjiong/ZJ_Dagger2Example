package com.zj.example.dagger2.example13

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example13.component.DaggerFruitComponent
import kotlinx.android.synthetic.main.activity_example13_layout.*
import javax.inject.Inject
import com.zj.example.dagger2.example13.bean.BananaBean
import com.zj.example.dagger2.example13.qualifier.MyQualifier


/**
 * Created by zhengjiong
 * date: 2019/2/10 15:03
 */
class Example13Activity : AppCompatActivity() {


    /**
     * 特定Set注入

    如果要为一个特定的集合注入数据，应对每个提供数据的Provides方法进行@Qualifier注解限定，
    从而避免了“依赖迷失”。在依赖注入该特定的Set时，也应使用相同的@Qualifier注解限定。
     */
    @field:[Inject MyQualifier(1)]
    lateinit var mSetBanana1: Set<BananaBean>

    @field:[Inject MyQualifier(2)]
    lateinit var mSetBanana2: Set<BananaBean>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example13_layout)

        btn1.setOnClickListener {

        }

        val fruitComponent = DaggerFruitComponent.create()
        fruitComponent.inject(this)



        //mSetBanana1: [BananaBean: name=香蕉-1 hashCode=157734477]
        println("mSetBanana1: " + mSetBanana1.toString())

        //mSetBanana2: [BananaBean: name=香蕉-3 hashCode=60035447, BananaBean: name=香蕉-4 hashCode=208134628]
        println("mSetBanana2: " + mSetBanana2.toString())

        //mSetBanana3: [BananaBean: name=香蕉-5 hashCode=44229890]
        println("mSetBanana3: " + fruitComponent.getBananas())
    }
}
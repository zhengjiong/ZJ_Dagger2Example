package com.zj.example.dagger2.example12

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example12.component.DaggerFruitComponent
import kotlinx.android.synthetic.main.activity_example12_layout.*
import com.zj.example.dagger2.example12.bean.SetBananaBean
import javax.inject.Inject
import com.zj.example.dagger2.example12.bean.BananaBean


/**
 * Created by zhengjiong
 * date: 2019/2/10 15:03
 */
class Example12Activity : AppCompatActivity() {

    @Inject
    lateinit var mSetBanana: Set<BananaBean>

    @Inject
    lateinit var mSetBananaBean: SetBananaBean

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example12_layout)

        btn1.setOnClickListener {

        }

        val fruitComponent = DaggerFruitComponent.create()
        fruitComponent.inject(this)



        println("mSetBanana: " + mSetBanana.toString())
        println("mSetBananaBean: " + mSetBananaBean.toString())

        /**
         * 该Component，不仅可以提供Set的依赖注入，还可以给其他依赖注入的实例提供数据源。当然，还可以使用Component获取注入的Set实例。
         */
        val setBanana = fruitComponent.getBananas();
        println("setBanana: " + setBanana.toString())
    }
}
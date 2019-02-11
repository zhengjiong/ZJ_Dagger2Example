package com.zj.example.dagger2.example15

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.example15.component.DaggerDrinkComponent
import com.zj.example.dagger2.example15.component.DrinkComponent
import javax.inject.Inject
import com.zj.example.dagger2.example15.bean.Apple
import com.zj.example.dagger2.example15.bean.Season


/**
 * Created by zhengjiong
 * date: 2019/2/10 22:31
 */
class Example15Activity : AppCompatActivity() {

    @Inject
    lateinit var appleMap: Map<Season, Apple>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val component: DrinkComponent = DaggerDrinkComponent.create()
        component.inject(this)

        /**
         * @MapKey 自定义 Map Key 注解
         *
         * 注释类型中声明的方法的返回类型,如果不满足指定的返回类型,那么编译时会报错:

         * 基本数据类型
         * String
         * Class
         * 枚举类型
         * 注解类型
         * 以上数据类型的数组
         */

        //appleMap -> [SPRING] | [Apple(name=apple-SPRING)]
        println("appleMap -> ${appleMap.keys} | ${appleMap.values}")
    }
}
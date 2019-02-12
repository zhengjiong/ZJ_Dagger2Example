package com.zj.example.dagger2.example18

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.example18.bean.Apple
import com.zj.example.dagger2.example18.bean.Fruits
import com.zj.example.dagger2.example18.component.AppleSubComponent
import com.zj.example.dagger2.example18.component.DaggerFruitComponent
import com.zj.example.dagger2.example18.component.FruitComponent
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Provider


/**
 * Created by zhengjiong
 * date: 2019/2/10 22:31
 */
class Example18Activity : AppCompatActivity() {

    @Inject
    lateinit var builder1Provider: Provider<AppleSubComponent.Builder>

    @Inject
    lateinit var fruitName: String

    @Inject
    lateinit var apple1: Apple

    @Inject
    lateinit var fruits1: Fruits

    @field:[Inject Named("sub")]
    lateinit var fruits2: Fruits

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val fruitComponent: FruitComponent = DaggerFruitComponent.create()
        val builder2 = fruitComponent.provideAppleSubComponentBuilder()
        builder2.build().inject(this)

        //apple1 = Apple(name=苹果-1)
        println("apple1 = $apple1")
        /**
         * 重要:
         * apple1和apple2是同一个对象, 但是builder和AppleSubComponent确不是同一个对象
         */

        val builder1: AppleSubComponent.Builder = builder1Provider.get()

        //builder1  92212542
        println("builder1  ${builder1.hashCode()}")

        //builder2  152418207
        println("builder2  ${builder2.hashCode()}")

        //2bd0ec
        println("sub1  ${builder1.build()}")
        //ed80cb5
        println("sub2  ${builder2.build()}")

        //1024353447
        println("apple1  ${builder1.build().supplyApple().hashCode()}")
        //1024353447
        println("apple2  ${builder2.build().supplyApple().hashCode()}")

        //Fruits(name=水果-1)
        println(fruits1)

        //Fruits(name=水果-1)
        println(fruits2)
    }
}
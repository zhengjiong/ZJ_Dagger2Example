package com.zj.example.dagger2.example6.di.module

import android.graphics.Color
import com.zj.example.dagger2.example6.bean.Apple
import com.zj.example.dagger2.example6.bean.Fruit
import com.zj.example.dagger2.example6.bean.Size
import dagger.Module
import dagger.Provides

/**
 *
 * CreateTime: 17/10/19  10:29
 * @author 郑炯
 */

@Module
class FruitModule {

    @Provides
    fun provideApple(color:Int):Fruit = Apple(color, Size.BIG)

    @Provides
    fun provideRedColor() = Color.RED
}
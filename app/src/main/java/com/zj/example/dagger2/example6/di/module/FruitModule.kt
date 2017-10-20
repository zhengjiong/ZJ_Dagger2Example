package com.zj.example.dagger2.example6.di.module

import com.zj.example.dagger2.example6.bean.Apple
import com.zj.example.dagger2.example6.bean.Banana
import com.zj.example.dagger2.example6.bean.Fruit
import com.zj.example.dagger2.example6.bean.Size
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 *
 * CreateTime: 17/10/19  10:29
 * @author 郑炯
 */

@Module
class FruitModule {

    //@Named("apple")
    @Provides
    fun provideAApple():Fruit = Apple(1, Size.BIG)


    //@Named("banana")
    /*@Provides
    fun provideBApple():Fruit = Banana(2, Size.BIG)*/


}
package com.zj.example.dagger2.example6.di.module

import com.zj.example.dagger2.example6.bean.*
import com.zj.example.dagger2.example6.di.qualifier.IntName
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

    @Provides
    @Named("apple")
    fun provideApple(): Fruit {
        return Apple("red", Size.BIG)
    }

    @Provides
    @Named("banana")
    fun provideBanana(): Fruit {
        return Banana("yellow", Size.BIG)
    }

    @Provides
    @IntName(9)
    fun provideOrange(): Fruit {
        return Orange("orange", Size.SMALL)
    }

}

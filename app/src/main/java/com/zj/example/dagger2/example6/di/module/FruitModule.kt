package com.zj.example.dagger2.example6.di.module

import com.zj.example.dagger2.example6.bean.Apple
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
    @Provides @Named("zj") fun provideAApple() = Apple(1, Size.BIG)

    @Provides @Named("zjj") fun provideBApple() = Apple(2, Size.BIG)


}
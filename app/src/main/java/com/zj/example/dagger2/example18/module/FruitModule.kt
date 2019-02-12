package com.zj.example.dagger2.example18.module

import com.zj.example.dagger2.example18.bean.Fruits
import com.zj.example.dagger2.example18.component.AppleSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by zhengjiong
 * date: 2019/2/12 16:44
 */
//todo,这里屏蔽掉subcomponents = [AppleSubComponent::class], 也不会编译错误, 暂时不知道为什么,以后理解源码的时候可以复制一份这个demo,然后看编译后生成的文件有什么不同
@Module(subcomponents = [AppleSubComponent::class])
class FruitModule {

    @Provides
    fun provideFruit(): Fruits {
        return Fruits("水果-1")
    }

    @Provides
    @Named("sub")
    fun provideSubApple(builder: AppleSubComponent.Builder): Fruits {
        val builder = builder.applyModule(AppleModule())
        val subCompomnent = builder.build()
        val apple = subCompomnent.supplyApple()

        return Fruits(apple.name)
    }
}
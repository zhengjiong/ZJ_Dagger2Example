package com.zj.example.dagger2.example11.module

import com.zj.example.dagger2.di.module.OkHttpModule
import com.zj.example.dagger2.example11.Example11Presenter
import com.zj.example.dagger2.example11.bean.Dog
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 *
 * CreateTime: 17/10/10  17:12
 * @author 郑炯
 */

/**
 * 重要:
 * 1.modules = Example11PresenterModule::class中方法需要的变量, 可以在OkHttpModule中提供的话,
 * 直接使用includes应用进来, 比如说Example11PresenterModule中的retrofit变量是OkHttpModule提供的
 */
@Module(includes = [OkHttpModule::class])
class Example11PresenterModule() {

    @Provides
    fun provideDog(): Dog = Dog("金金")

    @Provides
    fun providePresenter(retrofit: Retrofit, dog: Dog): Example11Presenter {
        return Example11Presenter(retrofit, dog)
    }
}
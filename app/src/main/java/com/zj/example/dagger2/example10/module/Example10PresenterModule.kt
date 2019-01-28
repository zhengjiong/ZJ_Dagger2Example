package com.zj.example.dagger2.example10.module

import com.zj.example.dagger2.example10.Example10Presenter
import com.zj.example.dagger2.example10.bean.Dog
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 *
 * CreateTime: 17/10/10  17:12
 * @author 郑炯
 */
@Module
class Example10PresenterModule() {

    @Provides
    fun provideDog(): Dog = Dog("金金")

    @Provides
    fun providePresenter(retrofit: Retrofit, dog: Dog): Example10Presenter {
        return Example10Presenter(retrofit, dog)
    }
}
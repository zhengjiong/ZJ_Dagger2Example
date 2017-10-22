package com.zj.example.dagger2.example6.di.module;

import com.zj.example.dagger2.example6.bean.Apple;
import com.zj.example.dagger2.example6.bean.Fruit;
import com.zj.example.dagger2.example6.bean.Size;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhengjiong
 * date: 2017/10/20 22:15
 */
@Module
public class FruitJavaModule {

    @Provides
    @Named("apple")
    Fruit provideApple(){
        return new Apple("red", Size.BIG);
    }

    @Provides
    @Named("banana")
    Fruit provideBanana(){
        return new Apple("yellow", Size.BIG);
    }

}

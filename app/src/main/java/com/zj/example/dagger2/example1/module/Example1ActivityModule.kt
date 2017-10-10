package com.zj.example.dagger2.example1.module

import com.zj.example.dagger2.example1.Example1Activity
import com.zj.example.dagger2.example1.bean.Example1Presenter
import com.zj.example.dagger2.example1.bean.User
import dagger.Module
import dagger.Provides

/**
 * 首先我们需要明确一个点，就是Module的作用是用来提供生成依赖对象的，
 * 比如我要注入DaggerPresenter，那么这个Module的作用就是需要生成
 * 一个DaggerPresenter的对象，来让Dagger2注入到DaggerActivity中。
 *
 *
 * 编写Module有以下几个注意点：

 * 类需要用@Module来标明注解
 * 这里有一点规则，用@Provides注解的函数需要以provide开头，然后后面接什么内容都可以，
 * 看自己喜欢，事实上，经过我的测试，我把provideActivity()改成provideA()同样是可
 * 以注入成功的，所以大家可以知道，这里是根据返回值类型来标识的，方法名并不重要
 *
 * CreateTime: 17/10/9  17:23
 * @author 郑炯
 */

@Module
class Example1ActivityModule(val activity: Example1Activity) {

    /**
     * 方法名字可以随便取
     */
    @Provides
    fun provideActivity(): Example1Activity = activity

    /**
     * 方法名字可以随便取
     */
    @Provides
    fun provideUser(): User = User("zhengjiong")


    /**
     * 方法名字可以随便取
     *
     * 我们这里需要编写一个函数provideDaggerPresenter,这个函数可以从上面的代码看出，
     * 我们需要对这个函数使用@Provides注解，然后，我们这里需要传入两个参数，一个DaggerActivity，
     * 一个User对象。那么，这两个参数从何而来呢?
     *
     * 细心的同学可能会发现，我上面的代码中还定义了两个函数，
     * 分别为provideUser和provideActivity，方法名字可以随便取, 主要是根据返回类型来识别
     * 这里provideDaggerPresenter的两个参数就是通过这两个函数来获取的。
     * 如果没有声明这两个函数的话，可能编译期间会报错哟。
     */
    @Provides
    fun provideDaggerPresenter(activity: Example1Activity, user: User): Example1Presenter = Example1Presenter(activity, user)
}
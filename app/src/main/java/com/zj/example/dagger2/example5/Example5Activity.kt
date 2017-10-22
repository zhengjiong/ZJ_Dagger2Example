package com.zj.example.dagger2.example5

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.App
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example5.di.component.ActivityComponent
import com.zj.example.dagger2.example5.di.component.DaggerActivityComponent
import com.zj.example.dagger2.example5.di.component.DaggerMainComponent
import com.zj.example.dagger2.example5.di.component.MainComponent
import com.zj.example.dagger2.example5.di.module.ActivityModule
import javax.inject.Inject

/**
 * 如果一个Component的功能不能满足你的需求，你需要对它进行拓展，一种办法是使用Component
 * (dependencies=××.classs)。另外一种是使用@Subcomponent，Subcomponent用于拓展原有
 * component。同时，这将产生一种副作用——子component同时具备两种不同生命周期的scope。
 * 子Component具备了父Component拥有的Scope，也具备了自己的Scope。
 *
 * Subcomponent其功能效果优点类似component的dependencies。但是使用@Subcomponent不需要
 * 在父component中显式添加子component需要用到的对象，只需要添加返回子Component的方法即可，
 * 子Component能自动在父Component中查找缺失的依赖。
 *
 * 通过Subcomponent，子Component就好像同时拥有两种Scope，当注入的元素来自父Component的Module，
 * 则这些元素会缓存在父Component，当注入的元素来自子Component的Module，则这些元素会缓存在子Component中。
 *
 * Created by zhengjiong
 * date: 2017/10/15 21:01
 */
class Example5Activity : AppCompatActivity() {

    /**
     * activity通过MainComponent中的ActivityModule注入
     */
    @Inject
    lateinit var activity: Activity

    lateinit var mainComponent: MainComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example5_layout)

        /**
         * 测试注入activity
         */
        var activityComponent: ActivityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .build()
        activityComponent.inject(this)
        println(activity?.localClassName)


        /**
         * 获取MainComponent,以便MainFragment中获取MainFragmentComponent
         */
        mainComponent = DaggerMainComponent.builder()
                .appComponent(App.app.mAppComponent)
                .activityModule(ActivityModule(this))
                .build()
        mainComponent.inject(this)

        supportFragmentManager.beginTransaction()
                .replace(R.id.frame_holder, Example5Fragment.newInstance(), "Example5Fragment")
                .commitAllowingStateLoss()

    }

    fun getComponent(): MainComponent = mainComponent
}

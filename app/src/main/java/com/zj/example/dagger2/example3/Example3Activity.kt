package com.zj.example.dagger2.example3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example3.bean.Cat
import com.zj.example.dagger2.example3.bean.Dog
import com.zj.example.dagger2.example3.component.DaggerExample3OkHttpComponent
import com.zj.example.dagger2.example3.component.DaggerExample3PresenterComponent
import com.zj.example.dagger2.example3.component.Example3OkHttpComponent
import com.zj.example.dagger2.example3.component.Example3PresenterComponent
import com.zj.example.dagger2.example3.module.Example3OkHttpModule
import com.zj.example.dagger2.example3.module.Example3PresenterModule
import kotlinx.android.synthetic.main.activity_example3_layout.*
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Inject

/**
 *
 * CreateTime: 17/10/10  16:49
 * @author 郑炯
 */
class Example3Activity : AppCompatActivity() {

    @Inject
    lateinit var presenter: Example3Presenter

    @Inject
    lateinit var retrofit: Retrofit


    /**
     * 这里如果想要注入, 那Example3OkHttpComponent中必须提供一个方法才行!不提提供方法就会报错
     */
    //@Inject
    //lateinit var okHttpClient: OkHttpClient

    @Inject
    lateinit var cat: Cat

    @Inject
    lateinit var dog: Dog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example3_layout)

        //生成一个Example3OkHttpModule对象提供给下面的注入对象
        /*val okHttpComponent: Example3OkHttpComponent = DaggerExample3OkHttpComponent.builder()
                .example3OkHttpModule(Example3OkHttpModule())
                .build()*/
        val okHttpComponent:Example3OkHttpComponent = DaggerExample3OkHttpComponent.create()
        val component: Example3PresenterComponent = DaggerExample3PresenterComponent.builder()
                .example3PresenterModule(Example3PresenterModule(this, Cat("黑娃")))
                .example3OkHttpComponent(okHttpComponent)//这里加上后,就可以注入Example3OkHttpComponent中提供的对象
                .build()

        component.inject(this)//这里注入后,就会实例化上面标记了@Inject注解的对象


        presenter.sayHello()
        retrofit.let {
            Toast.makeText(this, "retrofit注入成功", Toast.LENGTH_SHORT).show()
        }

        println(cat.name)

        println(dog.name)

    }

    fun hello(name: String) {
        textView.text = name
    }
}
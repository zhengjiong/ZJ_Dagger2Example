package com.zj.example.dagger2.example17

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.example17.component.DaggerDrinkComponent
import javax.inject.Inject


/**
 * Created by zhengjiong
 * date: 2019/2/10 22:31
 */
class Example17Activity : AppCompatActivity() {

    @Inject
    lateinit var presenter: PresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerDrinkComponent.create().inject(this)

        //getDrink -> Apple(name=apple-SPRING)
        presenter.getDrink()
    }
}
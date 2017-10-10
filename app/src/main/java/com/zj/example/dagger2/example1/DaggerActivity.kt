package com.zj.example.dagger2.example1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example1.bean.DaggerPresenter
import com.zj.example.dagger2.example1.component.ActivityComponent
import com.zj.example.dagger2.example1.component.DaggerActivityComponent
import com.zj.example.dagger2.example1.module.ActivityModule
import kotlinx.android.synthetic.main.activity_example1.*
import javax.inject.Inject

/**
 *
 * CreateTime: 17/10/9  17:18
 * @author 郑炯
 */

class DaggerActivity : AppCompatActivity() {
    @Inject
    lateinit var presenter: DaggerPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example1)


        /**
         * Make Project后,会生成一个DaggerActivityComponent，我们在Activity
         * 的onCreated函数中编写如下代码
         *
         * 可以看到我们首先调用这个了类的builder(),然后调用一些方法。这些方法也有一些规律，
         * 比如我们的ActivityComponent指定的module是ActivityModule，DaggerActivityComponent
         * 就会有一个名为activityModule的方法，我们需要调用它，并传入参数，
         * 这里我们直接new了一个ActivityModule进去。
         *
         * 好了，到此为止，我们已经使用Dagger2形成了关联，我们还需要注入Presenter。在Activity中：@Inject DaggerPresenter presenter;
         */
        //注入DaggerPresenter
        var activityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .build()

        activityComponent.getUser()
        activityComponent.inject(this)

        presenter.showUsername()
    }

    fun showUserName(name: String) {
        text.text = name
    }
}
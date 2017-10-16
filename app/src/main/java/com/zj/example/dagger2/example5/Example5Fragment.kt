package com.zj.example.dagger2.example5

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zj.example.dagger2.App
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example5.bean.MultiConstruct
import com.zj.example.dagger2.example5.di.component.DaggerMainComponent
import com.zj.example.dagger2.example5.di.component.MainFragmentComponent
import com.zj.example.dagger2.example5.di.module.ActivityModule
import javax.inject.Inject

/**
 *
 * CreateTime: 17/10/16  09:52
 * @author zhengjiong
 */


class Example5Fragment : Fragment() {

    @Inject
    lateinit var toastUtil: ToastUtil

    @Inject
    lateinit var multiConstruct: MultiConstruct

    lateinit var mainFragmentComponent: MainFragmentComponent

    companion object {
        fun newInstance(): Example5Fragment {
            var fragment = Example5Fragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_example5_layout, container, false)
        var btnShowToast = view.findViewById<View>(R.id.btnShowToast)
        btnShowToast.setOnClickListener {
            toastUtil.showToast(multiConstruct.toString())
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //mainFragmentComponent = (activity as Example5Activity).mainComponent.plusMainFragmentComponent()

        /**
         * 注入toastUtil
         */
        //mainFragmentComponent.inject(this)


        DaggerMainComponent.builder()
                .appComponent(App.app.mAppComponent)
                .activityModule(ActivityModule(activity))
                .build()
                .inject(this)
    }
}
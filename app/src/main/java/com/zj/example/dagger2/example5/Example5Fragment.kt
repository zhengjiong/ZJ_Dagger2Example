package com.zj.example.dagger2.example5

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zj.example.dagger2.R
import com.zj.example.dagger2.example5.bean.MultiConstruct
import com.zj.example.dagger2.example5.contract.Example5Contract
import com.zj.example.dagger2.example5.di.component.MainFragmentComponent
import com.zj.example.dagger2.example5.di.component.MainFragmentModule
import kotlinx.android.synthetic.main.fragment_example5_layout.*
import javax.inject.Inject

/**
 *
 * CreateTime: 17/10/16  09:52
 * @author zhengjiong
 */
class Example5Fragment : Fragment(), Example5Contract.View {

    @Inject
    lateinit var toastUtil: ToastUtil

    @Inject
    lateinit var multiConstruct: MultiConstruct

    @Inject
    lateinit var presenter: Example5Presenter

    lateinit var mainFragmentComponent: MainFragmentComponent

    companion object {
        fun newInstance(): Example5Fragment {
            var fragment = Example5Fragment()
            return fragment
        }
    }

    override fun setUsername(username: String) {
        tvInfo.text = username
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_example5_layout, container, false)
        var btnShowToast = view.findViewById<View>(R.id.btnShowToast)
        btnShowToast.setOnClickListener {
            toastUtil.showToast(multiConstruct.toString())
        }
        val btnGetUser = view.findViewById<View>(R.id.btnGetUser)
        btnGetUser.setOnClickListener {
            presenter.loadData()
        }

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        /**
         * 这里使用DaggerMainComponent也可以注入ToastUtil和MultiConstruct,
         * 但是我们不这样做,  我们使用MainFragmentComponent来注入
         */
        /*DaggerMainComponent.builder()
                .appComponent(App.app.mAppComponent)
                .activityModule(ActivityModule(activity))
                .build()
                .inject(this)*/

        mainFragmentComponent = (getActivity() as Example5Activity).getComponent().plusMainFragmentComponent(MainFragmentModule(this))

        /**
         * 注入toastUtil
         */
        mainFragmentComponent.inject(this)


    }
}
package com.zj.example.dagger2.module

import com.zj.example.dagger2.view.MainContract
import dagger.Module
import dagger.Provides

/**
 *
 * CreateTime: 17/10/9  15:55
 * @author 郑炯
 */

@Module
class MainModule(val view: MainContract.View) {

    @Provides
    fun provideMainView(): MainContract.View {
        return view
    }
}

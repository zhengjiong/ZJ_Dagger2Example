package com.zj.example.dagger2.example15

import com.zj.example.dagger2.example15.bean.Season
import dagger.MapKey

/**
 * Created by zhengjiong
 * date: 2019/2/11 11:10
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class AppleKey(val value: Season)

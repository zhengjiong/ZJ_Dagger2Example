package com.zj.example.dagger2.example6.di.qualifier

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

/**
 * Created by zhengjiong
 * date: 2017/10/22 11:27
 */

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class IntName(val value: Int)

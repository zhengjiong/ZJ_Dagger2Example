package com.zj.example.dagger2.example13.qualifier

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

/**
 * Created by zhengjiong
 * date: 2019/2/10 18:15
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class MyQualifier(val value: Int)
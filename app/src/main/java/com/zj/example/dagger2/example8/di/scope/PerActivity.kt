package com.zj.example.dagger2.example8.di.scope

import java.lang.annotation.Documented
import javax.inject.Scope

/**
 * 我们通常还会定义一个针对一个Activity生命周期的@PerActivity的Scope注解
 *
 * Created by zhengjiong
 * date: 2017/10/22 17:03
 */
@Scope
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity
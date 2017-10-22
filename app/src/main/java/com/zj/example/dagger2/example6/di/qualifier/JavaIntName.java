package com.zj.example.dagger2.example6.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by zhengjiong
 * date: 2017/10/22 11:33
 */

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface JavaIntName {
    int value();
}

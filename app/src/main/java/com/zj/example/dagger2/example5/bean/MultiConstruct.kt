package com.zj.example.dagger2.example5.bean

import javax.inject.Inject

/**
 *
 * 该类用来测试多个构造函数同时用@Inject进行标注，看dagger2是否能正常工作
 *
 * CreateTime: 17/10/16  10:03
 * @author zhengjiong
 */


/**
 * 只能在主构造方法加@Inject, 次构造加是没有用的而且会编译不通过!
 * 在module中会优先查找提供MultiConstruct实例的方法,如: ActivityModule中的
 * @PerActivity
 * @Provides
 * fun provideMultiConstruct(): MultiConstruct = MultiConstruct("zhengjiong2")
 *
 * 然后如果MultiConstruct的构造函数加了@Inject, 就会从module查找是构造函数的参数!
 * 如果构造函数没有参数就直接实例化!
 *
 */
data class MultiConstruct @Inject constructor(var str: String) {



    //次构造函数加@Inject会编译不通过
    /*
    @Inject
    constructor(x: Int) : this("sub constructor 1") {
        this.x = x
    }*/

    /*@Inject
    constructor(str: String) : this() {

    }*/
}
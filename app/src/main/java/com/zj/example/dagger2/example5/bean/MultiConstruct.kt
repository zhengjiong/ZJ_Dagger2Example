package com.zj.example.dagger2.example5.bean

import javax.inject.Inject

/**
 *
 * 该类用来测试多个构造函数同时用@Inject进行标注，看dagger2是否能正常工作
 *
 * CreateTime: 17/10/16  10:03
 * @author 郑炯
 */


class MultiConstruct @Inject constructor() {

    /*@Inject
    constructor(x: Int) : this() {

    }*/

    /*@Inject
    constructor(str: String) : this() {

    }*/
}
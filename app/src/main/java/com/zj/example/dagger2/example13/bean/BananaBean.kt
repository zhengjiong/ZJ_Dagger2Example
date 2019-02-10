package com.zj.example.dagger2.example13.bean

/**
 * Created by zhengjiong
 * date: 2019/2/10 15:07
 */
class BananaBean(val name: String) {

    override fun toString(): String {
        return "BananaBean: name=${name} hashCode=${hashCode()}"
    }
}
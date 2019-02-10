package com.zj.example.dagger2.example12.bean

import javax.inject.Inject

/**
 * Created by zhengjiong
 * date: 2019/2/10 15:09
 */
class SetBananaBean @Inject constructor(val banners: Set<BananaBean>) {

    override fun toString(): String {
        return "SetBananaBean: set=${banners}"
    }
}
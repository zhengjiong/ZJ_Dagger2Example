package com.zj.example.dagger2.example16

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.auto.value.AutoAnnotation
import com.zj.example.dagger2.example16.component.DrinkComponent
import javax.inject.Inject
import com.zj.example.dagger2.example16.bean.Apple
import com.zj.example.dagger2.example16.bean.Season


/**
 * Created by zhengjiong
 * date: 2019/2/10 22:31
 */
class Example16Activity : AppCompatActivity() {


    companion object {

        /*@JvmStatic
        @AutoAnnotation
        fun createMyKey(value: Season, num: Int): AppleKey {
            return AutoAnnotation_MyComponentTest_createMyKey(value, num)
        }*/
    }
    /*@AutoAnnotation
    lateinit var appleMap: Map<AppleKey, Apple>*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         * 该example没有完成, 遇到了问题没有解决
         */

       /* val component: DrinkComponent = DaggerDrinkComponent.create()
        component.inject(this)

        component.getAppleMap()*/
        /**
         * Map的Key由多个数据类型的成员组成
         * Complex map keys

        If your map’s key is more than can be expressed by a single annotation member,
        you can use the entire annotation as the map key by setting @MapKey’s unwrapValue to false.
        In that case, the annotation can have array members as well.

        复杂的key

        如果你的map的key是多个，可通过一个单一的注释成员表示，可以通过设置使用整个标注在map key@MapKey的
        unwrapValue到false。在这种情况下，注释也可以包含数组成员。
         *
         */

        //appleMap -> [SPRING] | [Apple(name=apple-SPRING)]
        //println("appleMap -> ${appleMap.keys} | ${appleMap.values}")
    }
}
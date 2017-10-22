package com.zj.example.dagger2.example8

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zj.example.dagger2.example8.bean.Machine
import com.zj.example.dagger2.example8.di.component.DaggerJuiceComponent
import javax.inject.Inject

/**
 *
 * 另一方面，如果两个Component间有依赖关系，那么它们不能使用相同的Scope。如果使用相同的Scope会带来语义混乱。
 * 考虑以下情况：
 *
 * Component1 c1 = Dagger_Component1.create();
 * Component2 c2_a = Dagger_Component2.builder().component1(c1).build();
 * Component2 c2_b = Dagger_Component2.builder().component1(c1).build();
 *
 * 我们先设
 * 1.c1中有单例V
 * 2.假设Component1与Component2有相同的Scope
 * 3.Component2依赖Component1
 * 推出以下矛盾
 * 1.由于Component1跟Component2具有相同的Scope，而c2_a,c2_b是Component2的不同实例，所以c2_a,c2_b应该具备不同的V
 * 2.由于c2_a,c2_b的V都是存在c1中，而且在c1中应该具备唯一的V，所以c2_a,c2_b应该具备相同的V。
 * 所以推出矛盾，证明依赖的Component间不能使用相同的Scope。
 *
 * Created by zhengjiong
 * date: 2017/10/22 16:58
 */
class Example8Activity : AppCompatActivity() {

    @Inject
    lateinit var fruitJuiceMachine: Machine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerJuiceComponent.builder().build().inject(this)


        println(fruitJuiceMachine.name)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
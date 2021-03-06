package com.zj.example.dagger2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.zj.example.dagger2.example1.Example1Activity
import com.zj.example.dagger2.example10.Example10Activity
import com.zj.example.dagger2.example11.Example11Activity
import com.zj.example.dagger2.example12.Example12Activity
import com.zj.example.dagger2.example13.Example13Activity
import com.zj.example.dagger2.example14.Example14Activity
import com.zj.example.dagger2.example15.Example15Activity
import com.zj.example.dagger2.example16.Example16Activity
import com.zj.example.dagger2.example17.Example17Activity
import com.zj.example.dagger2.example18.Example18Activity
import com.zj.example.dagger2.example19.Example19Activity
import com.zj.example.dagger2.example20.Example20Activity
import com.zj.example.dagger2.example2.Example2Activity
import com.zj.example.dagger2.example3.Example3Activity
import com.zj.example.dagger2.example4.Example4Activity
import com.zj.example.dagger2.example5.Example5Activity
import com.zj.example.dagger2.example6.Example6Activity
import com.zj.example.dagger2.example6.Example6JavaActivity
import com.zj.example.dagger2.example7.Example7Activity
import com.zj.example.dagger2.example8.Example8Activity
import com.zj.example.dagger2.example9.Example9Activity
import kotlinx.android.synthetic.main.activity_main.*

/**
 *
 * Component定义方法的规则:
 *
 * 1）Component的方法输入参数一般只有一个，对应了需要注入的Container。有输入参数返回值类型就是void
 * 2）Component的方法可以没有输入参数，但是就必须有返回值：
 *      Step1：返回的实例会先从事先定义的Module中查找，如果找不到跳到Step2
 *      Step2 : 使用该类带@Inject的构造器来生成返回的实例，并同时也会递归注入构造器参数以及带@Inject的成员变量。
 * 3 ) 假设ComponentA依赖ComponentB，B必须定义带返回值的方法来提供A缺少的依赖
 *
 *
 * 查找注入的变量规则:
 *  步骤1：查找Module中是否存在创建该类的方法。
 *  步骤2：若存在创建类方法，查看该方法是否存在参数
 *      步骤2.1：若存在参数，则按从**步骤1**开始依次初始化每个参数
 *      步骤2.2：若不存在参数，则直接初始化该类实例，一次依赖注入到此结束
 *  步骤3：若不存在创建类方法，则查找Inject注解的构造函数，看构造函数是否存在参数
 *      步骤3.1：若存在参数，则从**步骤1**开始依次初始化每个参数
 *      步骤3.2：若不存在参数，则直接初始化该类实例，一次依赖注入到此结束
 * CreateTime: 17/10/10  16:01
 * @author 郑炯
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = Adapter(this, listOf(
                Item("example1-简单注入", Example1Activity::class.java),
                Item("example2-如何实例化一个Component", Example2Activity::class.java),
                Item("example3-component依赖另一个component", Example3Activity::class.java),
                Item("example4-构造函数的参数也注入", Example4Activity::class.java),
                Item("example5-SubComponent", Example5Activity::class.java),
                Item("example6-@Named-kotlin", Example6Activity::class.java),
                Item("example6-@Named-java", Example6JavaActivity::class.java),
                Item("example7-Singleton单例的使用", Example7Activity::class.java),
                Item("example8-自定义Scope", Example8Activity::class.java),
                Item("example9-Lazy Provider", Example9Activity::class.java),
                Item("example10-一个module依赖另外一个module", Example10Activity::class.java),
                Item("example11-module-include", Example11Activity::class.java),
                Item("example12-intoSet多个元素注入1", Example12Activity::class.java),
                Item("example13-intoSet多个元素注入2-特定Set注入", Example13Activity::class.java),
                Item("example14-intoMap多个元素注入1", Example14Activity::class.java),
                Item("example15-intoMap-自定义Key", Example15Activity::class.java),
                Item("example16-intoMap-Key由多个数据类型的成员组成-该example因为问题没有完成", Example16Activity::class.java),
                Item("example17-binds", Example17Activity::class.java),
                Item("example18-SubComponent第二种用法-1", Example18Activity::class.java),
                Item("example19-SubComponent第二种用法-2", Example19Activity::class.java),
                Item("example20-dagger.android", Example20Activity::class.java)
        ))
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tv_title)
        val cartView: CardView = view.findViewById(R.id.cartView)

    }

    class Item(val name: String, val clazz: Class<*>)

    class Adapter(val context: Context, val items: List<Item>) : RecyclerView.Adapter<ViewHolder>() {
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder!!.tvTitle.text = items[position].name
            holder.cartView.setOnClickListener {
                var clazz = items[holder.adapterPosition].clazz
                context.startActivity(Intent(context, clazz))
            }
        }

        override fun getItemCount(): Int {
            return items.size
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            var view = LayoutInflater.from(context).inflate(R.layout.item_list_main, parent, false)
            return ViewHolder(view)
        }

    }

}
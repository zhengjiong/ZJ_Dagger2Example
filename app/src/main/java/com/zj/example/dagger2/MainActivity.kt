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
import com.zj.example.dagger2.example1.DaggerActivity
import com.zj.example.dagger2.example2.OkHttpActivity
import com.zj.example.dagger2.example3.Example3Activity
import kotlinx.android.synthetic.main.activity_main.*

/**
 *
 * CreateTime: 17/10/10  16:01
 * @author 郑炯
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = Adapter(this, listOf(
                Item("example1", DaggerActivity::class.java),
                Item("example2", OkHttpActivity::class.java),
                Item("example3", Example3Activity::class.java)
        ))
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tv_title)
        val cartView: CardView = view.findViewById(R.id.cartView)

    }

    class Item(val name: String, val clazz: Class<*>)

    class Adapter(val context: Context, val items: List<Item>) : RecyclerView.Adapter<ViewHolder>() {
        override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
            holder!!.tvTitle.text = items[position].name
            holder.cartView.setOnClickListener {
                var clazz = items[holder.adapterPosition].clazz
                context.startActivity(Intent(context, clazz))
            }
        }

        override fun getItemCount(): Int {
            return items.size
        }

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
            var view = LayoutInflater.from(context).inflate(R.layout.item_list_main, parent, false)
            return ViewHolder(view)
        }

    }

}
package com.zj.example.dagger2.example19;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zj.example.dagger2.example19.bean.Child;
import com.zj.example.dagger2.example19.component.DaggerFatherComponent;

import javax.inject.Inject;

/**
 * Created by zhengjiong
 * date: 2019/2/12 20:47
 */
public class Example19Activity extends AppCompatActivity {

    @Inject
    Child child;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerFatherComponent.create().buildChildComponent().build().inject(this);

        System.out.println(child.father.name);
    }
}

package com.zj.example.dagger2.example6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zj.example.dagger2.example6.bean.Fruit;
import com.zj.example.dagger2.example6.di.component.DaggerFruitComponent;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by zhengjiong
 * date: 2017/10/20 22:14
 */

public class Example6JavaActivity extends AppCompatActivity {

    @Named("apple")
    @Inject
    Fruit apple;

    @Named("banana")
    @Inject
    Fruit banana;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerFruitComponent.create().inject(this);

        System.out.println(apple.getColor());
        System.out.println(banana.getColor());
    }
}

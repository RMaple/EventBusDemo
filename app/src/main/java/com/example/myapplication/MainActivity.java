package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.greenrobot.eventbus.EventBus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //使用默认构建方式注册EventBus,若需要自定义某些参数，需使用EventBus.Builder
        EventBus.getDefault().register(this);
//        EventBus.builder().build();//自己设定某些参数后再build()
    }
}

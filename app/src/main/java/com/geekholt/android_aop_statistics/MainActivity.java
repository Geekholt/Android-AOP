package com.geekholt.android_aop_statistics;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shake(View btn) {
        long begin = System.currentTimeMillis();
        //模拟执行耗费时间的代码
        SystemClock.sleep(20);
        long duration = System.currentTimeMillis() - begin;
        Log.i("geekholt", String.format("功能：摇一摇功能，MainActivity的shake方法执行，耗时：%d ms", duration));
    }

    public void audio(View btn) {
        long begin = System.currentTimeMillis();
        //模拟执行耗费时间的代码
        SystemClock.sleep(20);
        long duration = System.currentTimeMillis() - begin;
        Log.i("geekholt", String.format("功能：语音功能，MainActivity的shake方法执行，耗时：%d ms", duration));
    }

    public void video(View btn) {
        long begin = System.currentTimeMillis();
        //模拟执行耗费时间的代码
        SystemClock.sleep(20);
        long duration = System.currentTimeMillis() - begin;
        Log.i("geekholt", String.format("功能：视频通话功能，MainActivity的shake方法执行，耗时：%d ms", duration));
    }

    public void jump(View btn) {

    }
}

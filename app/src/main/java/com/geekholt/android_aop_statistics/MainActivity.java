package com.geekholt.android_aop_statistics;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.geekholt.aspectj.annotation.BehaviorTrace;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @BehaviorTrace("摇一摇")
    public void shake(View btn) {
        //模拟执行耗费时间的代码
        Log.i("geekholt", "摇一摇...");
        SystemClock.sleep(20);
    }

    @BehaviorTrace("语音通话")
    public void audio(View btn) {
        //模拟执行耗费时间的代码
        Log.i("geekholt", "语音通话中...");
        SystemClock.sleep(20);
    }

    @BehaviorTrace("视频通话")
    public void video(View btn) {
        //模拟执行耗费时间的代码
        Log.i("geekholt", "视频通话中...");
        SystemClock.sleep(20);
    }

    public void jump(View btn) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}

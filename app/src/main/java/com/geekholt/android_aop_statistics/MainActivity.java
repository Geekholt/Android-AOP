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
        long begin = SumUtils.begin();
        //模拟执行耗费时间的代码
        {
            Log.i("geekholt", "摇一摇...");
            SystemClock.sleep(20);

        }
        SumUtils.end(begin, "摇一摇", "MainActivity", "shake");
    }

    public void audio(View btn) {
        long begin = SumUtils.begin();
        //模拟执行耗费时间的代码
        {
            Log.i("geekholt", "语音通话中...");
            SystemClock.sleep(20);

        }
        SumUtils.end(begin, "语音通话", "MainActivity", "audio");
    }

    public void video(View btn) {
        long begin = SumUtils.begin();
        //模拟执行耗费时间的代码
        {
            Log.i("geekholt", "视频通话中...");
            SystemClock.sleep(20);

        }
        SumUtils.end(begin, "视频通话", "MainActivity", "video");
    }

    public void jump(View btn) {

    }
}

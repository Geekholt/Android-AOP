package com.geekholt.android_aop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.geekholt.aspectj.annotation.BehaviorTrace;

/**
 * @author 吴灏腾
 * @date 2018/1/10
 * @describe TODO
 */

public class SecondActivity extends AppCompatActivity {

    @BehaviorTrace("加载第二个界面")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

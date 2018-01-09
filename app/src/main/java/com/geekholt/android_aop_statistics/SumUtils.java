package com.geekholt.android_aop_statistics;

import android.util.Log;

/**
 * @author 吴灏腾
 * @date 2018/1/9
 * @describe 用户行为统计类
 */

public class SumUtils {
    public static long begin() {
        return System.currentTimeMillis();
    }

    public static void end(long begin, String function, String className, String method) {
        long duration = System.currentTimeMillis() - begin;
        Log.i("geekholt", String.format("功能：%s，%s的%s方法执行，耗时：%d ms", function, className, method, duration));
    }
}

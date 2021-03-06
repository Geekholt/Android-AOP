package com.geekholt.aspectj.aspect;

import android.util.Log;

import com.geekholt.aspectj.annotation.BehaviorTrace;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * @author 吴灏腾
 * @date 2018/1/9
 * @describe 用户行为统计切面
 */

@Aspect
public class BehaviorAspect {
    private static final String POINTCUT_METHOD =
            "execution(@com.geekholt.aspectj.annotation.BehaviorTrace * *(..))";

    //任何一个包下面的任何一个类下面的任何一个带有BehaviorTrace的方法，构成了这个切面
    @Pointcut(POINTCUT_METHOD)
    public void annoHaviorTrace() {
        Log.i("geekholt", "annoHaviorTrace");
    }

    //拦截方法
    @Around("annoHaviorTrace()")
    public Object weaveJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        Log.i("", "weaveJoinPoint");
        //拿到方法的签名
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        //类名
        String className = methodSignature.getDeclaringType().getSimpleName();
        //方法名
        String methodName = methodSignature.getName();
        //功能名
        BehaviorTrace behaviorTrace = methodSignature.getMethod().getAnnotation(BehaviorTrace.class);
        String fun = behaviorTrace.value();

        //方法执行前
        long begin = System.currentTimeMillis();

        //执行拦截方法
        Object result = joinPoint.proceed();

        //方法执行后
        long duration = System.currentTimeMillis() - begin;
        Log.i("geekholt", String.format("功能：%s，%s的%s方法执行，耗时：%d ms", fun, className, methodName, duration));
        return result;
    }
}

package com.tz.cglib.spring2;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Random;

/**
 * create by tz on 2018-09-04
 */
public class TimeSpanAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        // 被织入的横切内容，开始时间 before
        long start = System.currentTimeMillis();
        lazy();

        //调用方法
        Object rs = invocation.proceed();

        //被织入的横切内容
        Long span = System.currentTimeMillis() - start;

        System.out.println("AOP代理了，共用时：" + span);
        return rs;
    }
    private void lazy() {
        int n = new Random().nextInt(500);
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

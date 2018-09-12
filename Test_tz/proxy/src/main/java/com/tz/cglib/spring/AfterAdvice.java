package com.tz.cglib.spring;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * create by tz on 2018-09-04
 */

/**
 * 后置通知
 *
 */
public class AfterAdvice implements AfterReturningAdvice {

    /**
     * returnValue 返回值
     * method 被调用的方法
     * args 方法参数
     * target 被代理对象
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("-------------------- 后置通知 ------------------------------");
    }
}

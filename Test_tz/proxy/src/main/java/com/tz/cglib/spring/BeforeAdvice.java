package com.tz.cglib.spring;

import org.aspectj.lang.JoinPoint;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * create by tz on 2018-09-04
 */
public class BeforeAdvice implements MethodBeforeAdvice {


    /**
     * method 方法信息
     * args 参数
     * target 被代理的目标对象
     */

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("---------------- 前置通知 ----------------------");
    }

    public void after(JoinPoint joinPoint) throws Throwable {
    }
}

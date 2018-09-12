package com.tz.cglib.springAOP2;

import org.aspectj.lang.JoinPoint;

import java.lang.reflect.Method;

/**
 * create by tz on 2018-09-04
 */
public class Advice {
    public void before(JoinPoint jp) throws Throwable {
        System.out.println("---------------- 前置通知 ----------------------");
        System.out.println("方法名："+jp.getSignature()+"，参数："+jp.getArgs().length+"，代理对象："+jp.getTarget());
    }

    public void after(JoinPoint jp) throws Throwable {
        System.out.println("-------------------- 后置通知 ------------------------------");
    }


}

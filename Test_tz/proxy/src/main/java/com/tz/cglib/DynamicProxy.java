package com.tz.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * create by tz on 2018-09-04
 */

/**
  * 动态代理类
  * 实现了一个方法拦截器接口
 * */

public class DynamicProxy implements MethodInterceptor {
    //被代理对象
    private Object targetObject;


    //动态生成一个新的类，使用父类的无参构造方法创建一个指定了特定回调的代理实例
    public Object getProxyObject(Object object) {
        this.targetObject = object;
        //增强器，动态代码生成器
        Enhancer enhancer = new Enhancer();
        //回调方法
        enhancer.setCallback(this);

        //设置生成类的父类类型
        enhancer.setSuperclass(targetObject.getClass());

        //动态生成字节码并返回代理对象
        return enhancer.create();
    }

    // 拦截方法
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        // 被织入的横切内容，开始时间 before
        long start = System.currentTimeMillis();
        lazy();

        //调用方法
        Object rs = methodProxy.invoke(targetObject, args);

        //被织入的横切内容
        Long span = System.currentTimeMillis() - start;

        System.out.println("代理了，共用时：" + span);
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

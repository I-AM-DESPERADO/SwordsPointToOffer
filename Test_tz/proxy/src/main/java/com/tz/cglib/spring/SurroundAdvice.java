package com.tz.cglib.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * create by tz on 2018-09-04
 */
public class SurroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        //前置横切逻辑
        System.out.println("方法" + invocation.getMethod() + "被调用在对象" + invocation.getThis() +
                "上,参数" + invocation.getArguments());
        //方法调用
        Object ret = invocation.proceed();
        //后置横切逻辑
        System.out.println("返回值：" + ret);
        return ret;
    }
}

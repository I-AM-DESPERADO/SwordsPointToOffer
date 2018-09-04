package com.tz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * create by tz on 2018-09-04
 */
public class DynamicProxy implements InvocationHandler {

    private Object targetObject;

    public Object getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(Object targetObject) {
        this.targetObject = targetObject;
    }

    /**
     * 获得被代理后的对象
     * @param object 被代理的对象
     * @return 代理后的对象
     */

    public Object getProxyObject(Object object) {
        this.targetObject = object;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), //类加载器
                                            targetObject.getClass().getInterfaces(),  //获得被代理对象的所有接口
                                                                    this);
    }


    /**
     * 当用户调用对象中的每个方法时都通过下面的方法执行，方法必须在接口
     * proxy 被代理后的对象
     * method 将要被执行的方法信息（反射）
     * args 执行方法时需要的参数
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        lazy();

        Object rs = method.invoke(targetObject, args);

        Long span = System.currentTimeMillis()-start;
        System.out.println("动态代理共用时：" + span);

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

package com.tz.cglib.springAOP;

import com.tz.cglib.proxy.IMath;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by tz on 2018-09-04
 */
public class Test {
   @org.junit.Test
    public void test1() {
        //容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        //从代理工厂中获得代理对象
        IMath math=(IMath)ctx.getBean("proxy");
        int n1=100,n2=5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }
}

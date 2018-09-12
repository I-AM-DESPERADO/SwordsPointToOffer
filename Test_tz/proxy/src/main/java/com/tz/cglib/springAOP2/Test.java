package com.tz.cglib.springAOP2;

import com.tz.cglib.proxy.IMath;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by tz on 2018-09-05
 */
public class Test {

    @org.junit.Test
    public void test01() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beanOfAOP.xml");

        IMath math = (IMath) ctx.getBean("math");
        int n1=100,n2=5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }
}

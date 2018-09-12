package com.tz.cglib.spring2;

import com.tz.cglib.proxy.IMath;
import com.tz.cglib.proxy.Math;

/**
 * create by tz on 2018-09-04
 */
public class Test {

    @org.junit.Test
    public void test1() {
        IMath math = (IMath) DynamicProxy.getProxy(new Math());
        int n1 = 100, n2 = 5;
        math.add(n1,n2);
        math.sub(n1,n2);
        math.mut(n1,n2);
        math.div(n1,n2);
    }
}

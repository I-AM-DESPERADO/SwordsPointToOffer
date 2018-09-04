package com.tz.proxy;

/**
 * create by tz on 2018-09-04
 */
public class Test {
    IMath math = (IMath) new DynamicProxy().getProxyObject(new Math());

    @org.junit.Test
    public void Tast01() {
        int n1 = 100,n2=5;
        math.add(n1,n2);
        math.sub(n1,n2);
        math.mut(n1,n2);
        math.div(n1,n2);


    }
}

package com.tz.mode;

/**
 * create by tz on 2018-07-05
 */
public class Singleton {

    /**
     * 私有化构造方法
     * */
    private Singleton() {}

    /**
     * 使用静态内部类维护单例
     * */
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    /**
     * 如果该对象用于序列化，可以保证对象在序列化的前后保持一致
     * */
    public Object readResolve() {
        return getInstance();
    }



}

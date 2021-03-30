package com.learn.designpattern.singleton;

/**
 * 静态内部类
 *
 * @author Artist-Q
 * @version 1.0, 24/02/2021
 * @since 0.1.0
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton() {
    }

    /**
     * 内部类
     */
    private static class InnerSingleton {
        private static StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    /**
     * 获取对象
     *
     * @return static inner singleton
     */
    public static StaticInnerSingleton getInstance() {
        return InnerSingleton.instance;
    }
}

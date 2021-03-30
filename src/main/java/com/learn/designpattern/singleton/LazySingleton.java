package com.learn.designpattern.singleton;

/**
 * 懒汉式
 *
 * @author Artist-Q
 * @version 1.0, 24/02/2021
 * @since 0.1.0
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }


    /**
     * 获取对象
     *
     * @return instance
     */
    public static synchronized LazySingleton getInstance() {
        if (null == instance) {
            return new LazySingleton();
        }
        return instance;
    }

}

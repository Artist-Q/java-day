package com.learn.designpattern.singleton;

/**
 * 饿汉式单例模式
 *
 * @author Artis-Q
 * @version 1.0, 24/02/2021
 * @since 0.1.0
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    /**
     * 获取对象
     *
     * @return instance
     */
    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}

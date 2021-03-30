package com.learn.designpattern.singleton;

/**
 * 枚举方式
 * <p>
 * effective java中比较推荐的一种方式
 * </p>
 *
 * @author Artist-Q
 * @version 1.0, 24/02/2021
 * @since 0.1.0
 */
public class EnumSingleton {

    private EnumSingleton() {
    }

    private enum Singleton {

        /** instance */
        INSTANCE;

        private final EnumSingleton instance;

        Singleton() {
            instance = new EnumSingleton();
        }

        private EnumSingleton getInstance() {
            return instance;
        }
    }

    /**
     * 获取对象
     *
     * @return instance
     */
    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }
}

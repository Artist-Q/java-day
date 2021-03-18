package com.learn.designpattern.singleton;

/**
 * 双重检查
 *
 * @author Artis-Q
 * @version 1.0, 24/02/2021
 * @since 0.1.0
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    /**
     * 获取对象
     *
     * @return instance
     */
    public static DoubleCheckSingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == instance) {
                    return new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}

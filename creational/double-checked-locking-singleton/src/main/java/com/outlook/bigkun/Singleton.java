package com.outlook.bigkun;

/**
 * @author zhanghk
 * @since 2019/7/13
 */
public class Singleton {
    private volatile static Singleton singleton = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) { // double-checked locking (DCL)
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

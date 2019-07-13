package com.outlook.bigkun;

/**
 * @author zhanghk
 * @since 2019/7/13
 */
public class Singleton {
    private static class SingletonHolder {
        private static Singleton singleton = new Singleton();
    }
    private Singleton(){}
    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }
}

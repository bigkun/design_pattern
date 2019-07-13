package com.outlook.bigkun;

/**
 * @author zhanghk
 * @since 2019/7/13
 */
public class NoSafeSingleton {
    private static NoSafeSingleton INSTANCE = null;

    private NoSafeSingleton() {
    }

    public static NoSafeSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (NoSafeSingleton.class) {
                // 这里没有进行double check
                INSTANCE = new NoSafeSingleton();
                // 经测试此次会打印多次，说明并发对INSTANCE进行了多次实例化
                System.out.println("INSTANCE:" + INSTANCE.hashCode());
            }

        }
        return INSTANCE;
    }

}

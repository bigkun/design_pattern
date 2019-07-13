package com.outlook.bigkun;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author zhanghk
 * @since 2019/7/13
 */
public class ConcurrentTest {
    private final static int threads = 10;
    private final static CountDownLatch countDown = new CountDownLatch(threads);
    // 枚举单例对象地址唯一，线程安全
    private static Runnable enumRunnable = () -> {
        try {
            countDown.await();
            Object obj = Singleton.INSTANCE;
            System.out.println("obj:" + obj.hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    // 没有double check的单例会出现多个对象地址，说明线程不安全
    // 如果增加第二次null检查就会避免并发实例化
    private static Runnable noSafeRunnable = () -> {
        try {
            countDown.await();
            Object obj = NoSafeSingleton.getInstance();
            System.out.println("obj:" + obj.hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(threads);
        for (int i = 0; i < threads; i++) {
            service.execute(noSafeRunnable);
            countDown.countDown();
        }

        TimeUnit.SECONDS.sleep(3);
        service.shutdown();
        System.out.println("over!");

    }
}

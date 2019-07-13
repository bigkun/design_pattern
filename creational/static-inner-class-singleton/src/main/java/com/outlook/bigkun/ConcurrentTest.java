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


    private static Runnable runnable = () -> {
        try {
            countDown.await();
            Object obj = Singleton.getInstance();
            System.out.println("obj:" + obj.hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    public static void main(String[] args) throws InterruptedException {
        System.out.println("------");
        ExecutorService service = Executors.newFixedThreadPool(threads);
        for (int i = 0; i < threads; i++) {
            service.execute(runnable);
            countDown.countDown();
        }

        TimeUnit.SECONDS.sleep(3);
        service.shutdown();
        System.out.println("over!");

    }
}

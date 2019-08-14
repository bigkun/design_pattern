package com.outlook.bigkun.demo2;

import java.util.Observer;
import java.util.concurrent.TimeUnit;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClockObservable observable = new ClockObservable();


        Observer observer1 = new TimeReaderObserver("#1");
        Observer observer2 = new TimeReaderObserver("#2");
        observable.addObserver(observer1);
        observable.addObserver(observer2);

        for (int i = 0; i < 10; i++) {
            TimeUnit.SECONDS.sleep(2);
            observable.updateTime();
            observable.notifyObservers();
        }


    }
}

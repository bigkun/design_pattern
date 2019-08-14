package com.outlook.bigkun.demo2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class TimeReaderObserver implements Observer {
    private String name;

    public TimeReaderObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("["+name + "] TimeReader:" + ((ClockObservable) o).getTime());
    }
}

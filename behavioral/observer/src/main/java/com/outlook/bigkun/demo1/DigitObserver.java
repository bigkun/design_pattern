package com.outlook.bigkun.demo1;

import java.util.concurrent.TimeUnit;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:"+generator.getNumber());

        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

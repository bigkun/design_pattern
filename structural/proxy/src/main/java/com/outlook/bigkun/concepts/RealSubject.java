package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/2
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject request");
    }
}

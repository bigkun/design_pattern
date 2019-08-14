package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class ConcreteStateB extends State {
    @Override
    public void handle() {
        System.out.println("B");
    }
}

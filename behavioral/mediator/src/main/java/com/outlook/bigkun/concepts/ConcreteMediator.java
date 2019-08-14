package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class ConcreteMediator extends Mediator {

    @Override
    public void operation() {
        colleagues.get(0).method1();
        colleagues.get(1).method2();
    }
}

package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void method1();

    public void method2() {
        mediator.operation();
    }
}

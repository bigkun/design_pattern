package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void method1() {
        System.out.println("method1");
    }
}

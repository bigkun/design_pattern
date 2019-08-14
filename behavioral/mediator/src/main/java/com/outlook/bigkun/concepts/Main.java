package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague0 =new ConcreteColleague(mediator);
        Colleague colleague1 = new ConcreteColleague(mediator);
        mediator.register(colleague0);
        mediator.register(colleague1);

        mediator.operation();

    }
}

package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class Main {
    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver("o1");
        Observer observer2 = new ConcreteObserver("o2");

        Subject subject = new ConcreteSuject();
        subject.attach(observer1);
        subject.attach(observer2);

        subject.notice();
    }
}

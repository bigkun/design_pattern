package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        State stateA = new ConcreteStateA();
        State stateB = new ConcreteStateB();
        context.setState(stateA);
        context.request();

        context.setState(stateB);
        context.request();
    }
}

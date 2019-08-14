package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        int a = 10;
        int b = 20;

        AbstractStrategy strategy = new ConcreteStrategyA();
        context.setStrategy(strategy);

        context.algorithm(a, b);
        strategy = new ConcreteStrategyB();
        context.setStrategy(strategy);
        context.algorithm(a, b);

    }
}

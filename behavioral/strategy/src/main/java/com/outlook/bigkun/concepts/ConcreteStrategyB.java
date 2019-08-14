package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class ConcreteStrategyB extends AbstractStrategy {

    @Override
    void algorithm(int a, int b) {
        System.out.println("B: a*b= "+(a*b));
    }
}

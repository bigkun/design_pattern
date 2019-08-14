package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class ConcreteStrategyA extends AbstractStrategy {

    @Override
    void algorithm(int a, int b) {
        System.out.println("A: a+b= "+(a+b));
    }
}

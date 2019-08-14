package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class Context {
    private AbstractStrategy strategy;

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm(int a, int b) {
        strategy.algorithm(a, b);
    }
}

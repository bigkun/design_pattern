package com.outlook.bigkun.concepts;

/**
 * 具体的 内部状态
 *
 * @author zhanghk
 * @since 2019/8/2
 */
public class ConcreteIntrinsicState implements IntrinsicState {
    private String name;

    public ConcreteIntrinsicState(String name) {
        this.name = name;
    }
}

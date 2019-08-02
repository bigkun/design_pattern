package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/2
 */
public class ConcreteFlyweight implements Flyweight {
    /**
     * 对象固有状态/属性
     */
    private IntrinsicState state;

    public ConcreteFlyweight(IntrinsicState state) {
        this.state = state;
    }

    /**
     * @param state 外部参数
     */
    @Override
    public void operation(ExtrinsicState state) {

        System.out.println("state:" + state.getClass().getName());
    }
}

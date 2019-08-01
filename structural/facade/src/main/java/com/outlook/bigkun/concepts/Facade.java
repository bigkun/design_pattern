package com.outlook.bigkun.concepts;

/**
 * 门面类，此处提供统一的对外接口，隐藏内部实现细节
 *
 * @author zhanghk
 * @since 2019/8/1
 */
public class Facade {
    SubsystemA subsystemA;
    SubsystemB subsystemB;

    public Facade() {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
    }

    /**
     * 统一对外提供的接口
     */
    public void bizMethod() {
        subsystemA.methodA();
        subsystemB.methodB();
    }
}

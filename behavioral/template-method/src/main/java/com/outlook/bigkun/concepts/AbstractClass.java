package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/15
 */
public abstract class AbstractClass {
    /**
     * 定义业务逻辑
     */
    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        primitiveOperation3();
    }

    public void primitiveOperation1() {

    }

    public abstract void primitiveOperation2();

    public abstract void primitiveOperation3();
}

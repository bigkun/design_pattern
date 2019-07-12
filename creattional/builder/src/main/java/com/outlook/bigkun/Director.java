package com.outlook.bigkun;

/**
 * @author zhanghk
 * @since 2019/7/12
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 组装最终产品
     * {@link Director} 在这里定义建造顺序。
     */
    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}

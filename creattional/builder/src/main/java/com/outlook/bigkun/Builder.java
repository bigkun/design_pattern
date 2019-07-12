package com.outlook.bigkun;

/**
 * @author zhanghk
 * @since 2019/7/12
 */
public interface Builder {
    void buildPartA();

    void buildPartB();

    void buildPartC();

    Product getResult();
}

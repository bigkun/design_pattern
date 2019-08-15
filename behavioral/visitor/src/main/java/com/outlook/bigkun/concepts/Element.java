package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/15
 */
public interface Element {
    void accept(Visitor visitor);
}

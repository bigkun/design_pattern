package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/13
 */
public interface Aggregate {
    /**
     * 获取一个迭代器
     *
     * @return
     */
    Iterator iterator();
}

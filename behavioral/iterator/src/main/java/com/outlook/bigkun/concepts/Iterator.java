package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/13
 */
public interface Iterator {
    /**
     * 将游标指向第一个元素
     */
    void first();

    /**
     * 将游标指向下一个元素
     */
    void next();

    /**
     * 判断是否存在下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 获取游标当前指向的元素
     *
     * @return
     */
    Object currentItem();
}

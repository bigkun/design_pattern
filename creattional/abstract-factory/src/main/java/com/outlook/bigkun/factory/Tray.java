package com.outlook.bigkun.factory;

import java.util.ArrayList;

/**
 * 元素容器，可以包含多个元素
 *
 * @author zhanghk
 * @since 2019/7/10
 */
public abstract class Tray extends Item {
    /**
     * 元素容器集合
     */
    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    /**
     * 添加一个Item {@link Item}
     *
     * @param item {@link Item}
     */
    public void add(Item item) {
        tray.add(item);
    }
}

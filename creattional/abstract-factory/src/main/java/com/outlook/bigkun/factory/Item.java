package com.outlook.bigkun.factory;

/**
 * 条目类，基础类
 * HTML上的每一个元素都是一个条目,每个条目都有一个标题
 *
 * @author zhanghk
 * @since 2019/7/10
 */
public abstract class Item {
    /**
     * 标题
     */
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    /**
     * 生成条目的html语法表示
     *
     * @return
     */
    public abstract String makeHTML();
}

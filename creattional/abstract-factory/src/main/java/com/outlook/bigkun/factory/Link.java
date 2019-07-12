package com.outlook.bigkun.factory;

/**
 * 超链接元素，继承自Item，超链接的特性属性{@link Link#url}
 *
 * @author zhanghk
 * @since 2019/7/10
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}

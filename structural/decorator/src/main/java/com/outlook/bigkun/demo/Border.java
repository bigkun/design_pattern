package com.outlook.bigkun.demo;

/**
 * 边框装饰类
 * {@link com.outlook.bigkun.concepts.Decorator}
 *
 * @author zhanghk
 * @since 2019/7/30
 */
public abstract class Border extends Display {
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}

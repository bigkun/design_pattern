package com.outlook.bigkun.demo2;

/**
 * @author zhanghk
 * @since 2019/7/24
 */
public abstract class Shape {
    protected Draw draw;

    protected Shape(Draw draw) {
        this.draw = draw;
    }

    public abstract void draw();
}

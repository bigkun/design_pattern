package com.outlook.bigkun.demo2;

/**
 * @author zhanghk
 * @since 2019/7/24
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(Draw draw, int x, int y, int radius) {
        super(draw);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        draw.drawCircle(radius, x, y);
    }
}

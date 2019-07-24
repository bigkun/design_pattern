package com.outlook.bigkun.demo2;

/**
 * @author zhanghk
 * @since 2019/7/24
 */
public class Main {
    public static void main(String[] args) {
        Shape red =new Circle(new RedCircle(),100,100,10);
        Shape green =new Circle(new GreenCircle(),200,200,20);
        red.draw();
        green.draw();
    }
}

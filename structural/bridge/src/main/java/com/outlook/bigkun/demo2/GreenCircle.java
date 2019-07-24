package com.outlook.bigkun.demo2;

/**
 * @author zhanghk
 * @since 2019/7/24
 */
public class GreenCircle implements Draw {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("绿色圆: radius:"+radius+", x:"+x+", y:"+y+".");
    }
}

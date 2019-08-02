package com.outlook.bigkun.demo1;

/**
 * 抽象享元类：围棋棋子
 * {@link com.outlook.bigkun.concepts.Flyweight}
 *
 * @author zhanghk
 * @since 2019/8/2
 */
public abstract class IgoChessman {
    /**
     * 棋子颜色
     * 内部状态
     * {@link com.outlook.bigkun.concepts.IntrinsicState}
     *
     * @return
     */
    public abstract String getColor();

    public void display(Coordinates coord) {
        System.out.println("chessman's color:" + getColor() + ", position:" + coord);
    }
}

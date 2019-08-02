package com.outlook.bigkun.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 围棋，棋子颜色为内部状态，固定不变；棋子位置为外部状态，可变
 * 不可变部分放入享元池缓存，变化部分不缓存
 * 例子中，虽然棋面上有11个棋子，但实际分配的棋子对象只有黑子和白子各一个。
 *
 * @author zhanghk
 * @since 2019/8/2
 */
public class Main {
    public static void main(String[] args) {

        List<IgoChessman> blacklist = new ArrayList<>(5);
        List<IgoChessman> whitelist = new ArrayList<>(6);


        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();

        for (int i = 0; i < 5; i++) {
            blacklist.add(factory.getIgoChessman("b"));
            System.out.println("black: " + i + " hashCode:" + blacklist.get(i).hashCode());
        }

        for (int i = 0; i < 6; i++) {
            whitelist.add(factory.getIgoChessman("w"));
            System.out.println("white: " + i + " hashCode:" + whitelist.get(i).hashCode());
        }

        for (int i = 0; i < blacklist.size(); i++) {
            blacklist.get(i).display(new Coordinates(i, i * 2));
        }

        for (int i = 0; i < whitelist.size(); i++) {
            whitelist.get(i).display(new Coordinates(i * 2, i));
        }


    }
}

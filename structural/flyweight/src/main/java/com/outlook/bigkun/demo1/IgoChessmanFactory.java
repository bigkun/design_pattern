package com.outlook.bigkun.demo1;

import java.util.Hashtable;

/**
 * 享元池工厂类
 *
 * @author zhanghk
 * @since 2019/8/2
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable ht;

    public IgoChessmanFactory() {
        ht = new Hashtable();
        IgoChessman black = new BlackIgoChessman();
        IgoChessman white = new WhiteIgoChessman();
        ht.put("b", black);
        ht.put("w", white);
    }

    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    public IgoChessman getIgoChessman(String color) {
        return (IgoChessman) ht.get(color);
    }
}

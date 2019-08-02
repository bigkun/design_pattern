package com.outlook.bigkun.demo1;

/**
 * 具体的享元类：黑子
 * {@link com.outlook.bigkun.concepts.ConcreteFlyweight}
 *
 * @author zhanghk
 * @since 2019/8/2
 */
public class BlackIgoChessman extends IgoChessman {
    @Override
    public String getColor() {
        return "黑色";
    }
}

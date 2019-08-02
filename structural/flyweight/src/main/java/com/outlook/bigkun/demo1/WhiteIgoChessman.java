package com.outlook.bigkun.demo1;

/**
 * 具体的享元类：白子
 * {@link com.outlook.bigkun.concepts.ConcreteFlyweight}
 *
 * @author zhanghk
 * @since 2019/8/2
 */
public class WhiteIgoChessman extends IgoChessman {
    @Override
    public String getColor() {
        return "白色";
    }
}

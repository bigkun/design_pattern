package com.outlook.bigkun.concepts;

import java.util.Hashtable;

/**
 * @author zhanghk
 * @since 2019/8/2
 */
public class FlyweightFactory {
    private Hashtable flyweights = new Hashtable();

    public Flyweight getFlyweight(Object key) {
        Flyweight flyweight = (Flyweight) flyweights.get(key);
        if (flyweight == null) {

            flyweight = new ConcreteFlyweight(new ConcreteIntrinsicState(key.toString()));
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}

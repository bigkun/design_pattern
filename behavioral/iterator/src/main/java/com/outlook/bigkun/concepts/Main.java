package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/13
 */
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate(4);
        concreteAggregate.addObject(new ConcreteObject("field1"));
        concreteAggregate.addObject(new ConcreteObject("field2"));
        concreteAggregate.addObject(new ConcreteObject("field3"));
        concreteAggregate.addObject(new ConcreteObject("field4"));
        Iterator iterator = concreteAggregate.iterator();
        while (iterator.hasNext()) {
            ConcreteObject object = (ConcreteObject) iterator.currentItem();
            System.out.println(object);
            iterator.next();
        }
    }
}

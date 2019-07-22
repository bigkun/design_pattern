package com.outlook.bigkun;

/**
 * @author zhanghk
 * @since 2019/7/22
 */
public class Main {
    public static void main(String[] args) {
        // 1. 创建一个原始对象
        ConcretePrototype concretePrototype1 = new ConcretePrototype();
        concretePrototype1.setField("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        // 2. 原始对象调用 copy() 实现自我复制
        ConcretePrototype concretePrototype2 = (ConcretePrototype) concretePrototype1.copy();

        assert concretePrototype1 != concretePrototype2;
        System.out.println("concretePrototype2 field: "+ concretePrototype2.getField());

        System.out.println("concretePrototype2 is copied from concretePrototype1");
    }
}

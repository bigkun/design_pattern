package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/2
 */
public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("Fred");
        Flyweight flyweight2 = factory.getFlyweight("Wilma");
        Flyweight flyweight3 = factory.getFlyweight("Fred");

        System.out.println("flyweight1==flyweight2:" + (flyweight1 == flyweight2));
        System.out.println("flyweight1==flyweight3:" + (flyweight1 == flyweight3));

        // 不被共享利用的类， 每次都是new 创建
        Flyweight unsharedFlyweight = new UnsharedConcreteFlyweight();

    }
}

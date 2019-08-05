package com.outlook.bigkun.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zhanghk
 * @since 2019/8/2
 */
public class Main {
    public static void main(String[] args) {
        // RealSubject
        Car car = new Car();

        // Proxy
        // 对被代理对象增加一些其他操作
        InvocationHandler handler = new TimeHandler(car);
        Class<?> cls = car.getClass();

        // 使用代理对象
        Moveable move = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), handler);
        // 执行Proxy对象的方法
        move.move();
    }
}

package com.outlook.bigkun;

/**
 * @author zhanghk
 * @since 2019/8/5
 */
public class Main {
    public static void main(String[] args) {
        CglibProxyInterceptor proxy = new CglibProxyInterceptor();
        Car car = (Car) proxy.getProxy(Car.class);
        car.move();
        car.move("Weihai");

    }
}

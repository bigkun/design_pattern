package com.outlook.bigkun;

/**
 * @author zhanghk
 * @since 2019/7/13
 */
public class Main {
    // 枚举单例的静态域和静态代码块会在第1条分隔线之后打印，说明是延迟加载
    public static void main(String[] args) {
        System.out.println("1-----------------");
        Singleton.INSTANCE.getName();
        System.out.println("2-----------------");
        Singleton.INSTANCE.getName();
    }
}

package com.outlook.bigkun.object;

/**
 * @author zhanghk
 * @since 2019/7/23
 */
public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}

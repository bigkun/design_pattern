package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/2
 */
public class Main {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Subject proxy = new Proxy(realSubject);
        proxy.request();
    }
}

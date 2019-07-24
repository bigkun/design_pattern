package com.outlook.bigkun.demo1;

/**
 * @author zhanghk
 * @since 2019/7/24
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Lily."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe"));
        d1.display();
        d2.display();
        d3.multiDisplay(5);
    }
}

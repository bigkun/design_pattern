package com.outlook.bigkun.demo;

/**
 * @author zhanghk
 * @since 2019/7/30
 */
public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello World.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b1);
        b1.show();
        System.out.println("");
        b2.show();
        System.out.println("");
        b3.show();

        System.out.println("");
        Display b4 = new FullBorder(
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("Come on!")
                                                ), '*'
                                        )
                                )
                        )
                        , '|'
                )
        );
        b4.show();
    }
}

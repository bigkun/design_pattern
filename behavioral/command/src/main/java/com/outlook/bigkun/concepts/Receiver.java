package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/5
 */
public class Receiver {
    public void action(Command command) {

        System.out.println("Receiver action:"+ command.getCommand());
    }
}

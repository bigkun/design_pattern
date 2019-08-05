package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/5
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand("command 1", receiver);
        Invoker invoker = new Invoker(command);
        invoker.call();

    }
}

package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/5
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }
}

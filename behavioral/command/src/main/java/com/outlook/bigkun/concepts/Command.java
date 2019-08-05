package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/5
 */
public abstract class Command {
    private String command;

    public Command(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public abstract void execute();
}

package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/5
 */
public class ConcreteCommand extends Command {
    private Receiver receiver;

    public ConcreteCommand(String command) {
        super(command);
    }

    public ConcreteCommand(String command, Receiver receiver) {
        super(command);
        this.receiver = receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action(this);
    }
}

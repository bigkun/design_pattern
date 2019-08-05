package com.outlook.bigkun.demo1;

/**
 * {@link com.outlook.bigkun.concepts.ConcreteCommand}
 *
 * @author zhanghk
 * @since 2019/8/5
 */
public class HelpCommand extends Command {
    private HelpHandler hhObj;

    public HelpCommand() {
        this.hhObj = new HelpHandler();
    }

    @Override
    public void execute() {
        hhObj.display();
    }
}

package com.outlook.bigkun.demo1;

/**
 * @author zhanghk
 * @since 2019/8/5
 */
public class MinimizeCommand extends Command {
    private WindowHandler whObj;

    public MinimizeCommand() {
        whObj = new WindowHandler();
    }

    @Override
    public void execute() {
        whObj.minimize();
    }
}

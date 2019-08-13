package com.outlook.bigkun.demo1;

/**
 * @author zhanghk
 * @since 2019/8/13
 */
public class ActionNode extends AbstractNode {
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        String result = null;
        switch (action) {
            case "move":
                result = "移动";
                break;
            case "run":
                result = "快速移动";
                break;
            default:
                result = "无效指令";
        }
        return result;
    }
}

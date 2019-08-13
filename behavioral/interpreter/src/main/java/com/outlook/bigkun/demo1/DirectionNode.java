package com.outlook.bigkun.demo1;

/**
 * @author zhanghk
 * @since 2019/8/13
 */
public class DirectionNode extends AbstractNode {
    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpret() {
        String result = null;
        switch (direction) {
            case "up":
                result = "向上";
                break;
            case "down":
                result = "向下";
                break;
            case "left":
                result = "向左";
                break;
            case "right":
                result = "向右";
                break;
            default:
                result = "无效指令";
        }
        return result;
    }
}

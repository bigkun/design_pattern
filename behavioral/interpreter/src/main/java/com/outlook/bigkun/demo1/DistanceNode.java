package com.outlook.bigkun.demo1;

/**
 * @author zhanghk
 * @since 2019/8/13
 */
public class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    @Override
    public String interpret() {
        return distance;
    }
}

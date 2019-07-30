package com.outlook.bigkun.safe_concepts;

/**
 * 叶子节点，不再含有子节点
 *
 * @author zhanghk
 * @since 2019/7/30
 */
public class Leaf implements Component {
    private String id;

    public Leaf(String id) {
        this.id = id;
    }

    @Override
    public void bizMethod() {
        System.out.println("The ID of this leaf is: " + id);
    }
}

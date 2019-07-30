package com.outlook.bigkun.concepts;

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
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void bizMethod() {
        System.out.println("The ID of this leaf is: " + id);
    }
}

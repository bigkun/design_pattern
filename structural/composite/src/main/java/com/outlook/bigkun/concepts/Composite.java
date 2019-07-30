package com.outlook.bigkun.concepts;

import java.util.ArrayList;

/**
 * 容器节点
 *
 * @author zhanghk
 * @since 2019/7/30
 */
public class Composite implements Component {
    private ArrayList<Component> list = new ArrayList<>();

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void bizMethod() {
        for (Component component : list) {
            component.bizMethod();
        }
    }
}

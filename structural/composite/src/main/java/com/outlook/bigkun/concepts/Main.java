package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/7/30
 */
public class Main {
    public static void main(String[] args) {
        Leaf leaf = new Leaf("1");
        Composite composite = new Composite();
        composite.add(leaf);

        Composite composite1 = new Composite();
        composite1.add(new Leaf("2"));
        composite1.add(new Leaf("3"));
        composite.add(composite1);

        Composite composite2 = new Composite();
        Composite composite3 = new Composite();
        composite3.add(new Leaf("11"));
        composite2.add(composite3);
        composite.add(composite2);

        composite.bizMethod();
    }
}

package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/15
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationA() {
        System.out.println("operationA");
    }
}

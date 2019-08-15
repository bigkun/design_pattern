package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/15
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationB() {
        System.out.println("operationB");
    }
}

package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/15
 */
public class ConcreteElementC implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationC() {
        System.out.println("operationC");
    }
}

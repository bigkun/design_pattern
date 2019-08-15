package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/15
 */
public abstract class Visitor {
    public abstract void visit(ConcreteElementA elementA);

    public abstract void visit(ConcreteElementB elementB);

    public void visit(ConcreteElementC elementC) {
        elementC.operationC();

    }
}

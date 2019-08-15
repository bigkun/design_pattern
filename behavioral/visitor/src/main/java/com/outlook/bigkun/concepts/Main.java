package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/15
 */
public class Main {
    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(new ConcreteElementA());
        objectStructure.addElement(new ConcreteElementB());
        objectStructure.addElement(new ConcreteElementC());
        objectStructure.accept(new ConcreteVisitor());
    }
}

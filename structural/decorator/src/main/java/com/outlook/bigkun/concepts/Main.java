package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/7/30
 */
public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.bizMethods();

        System.out.println("\nthe component add a decorator.\n");
        Decorator decorator = new ConcreteDecorator(component);
        decorator.bizMethods();
    }
}

package com.outlook.bigkun.concepts;

/**
 * 具体的装饰者实现类
 * 增加装饰方法
 *
 * @author zhanghk
 * @since 2019/7/30
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void bizMethods() {
        super.bizMethods();
        addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("addedBehavior");
    }
}

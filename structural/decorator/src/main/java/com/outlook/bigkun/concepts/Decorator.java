package com.outlook.bigkun.concepts;

/**
 * 装饰者类
 * 以组合的方式扩展原始组件
 *
 * @author zhanghk
 * @since 2019/7/30
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void bizMethods() {
        component.bizMethods();
    }
}

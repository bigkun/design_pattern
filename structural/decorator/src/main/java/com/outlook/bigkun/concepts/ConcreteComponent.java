package com.outlook.bigkun.concepts;

/**
 * 具体的组件实现类
 *
 * @author zhanghk
 * @since 2019/7/30
 */
public class ConcreteComponent implements Component {
    @Override
    public void bizMethods() {
        System.out.println("ConcreteComponent");
    }
}

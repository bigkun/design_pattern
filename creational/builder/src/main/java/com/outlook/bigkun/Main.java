package com.outlook.bigkun;

/**
 * @author zhanghk
 * @since 2019/7/12
 */
public class Main {
    public static void main(String[] args) {
        //1.实例化建造者
        Builder builder = new ConcreteBuilder();
        //2.实例化建造工程的项目负责人
        Director director = new Director(builder);
        //3.项目负责人指导生产
        director.construct();
        //4.生成产品
        Product product = builder.getResult();
        //5.使用产品实例对象
        product.show();
    }
}

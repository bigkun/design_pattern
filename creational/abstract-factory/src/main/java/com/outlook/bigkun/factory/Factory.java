package com.outlook.bigkun.factory;

/**
 * 定义一种抽象的生产规范，将抽象的零件生产出抽象的产品。
 * 寻找业务共性，抽象出一套通用的生产流程，不同的最终产品使用不同的具体工厂和零件。
 * 典型的抽象工厂模式，工厂类中有多个create方法，创建不同的零件
 *
 * @author zhanghk
 * @since 2019/7/10
 */
public abstract class Factory {
    /**
     * 根据类名创建工厂实例
     * 与通过传递type参数相比，对于扩展不需要改变工厂方法内部代码
     *
     * @param classname extends {@link Factory}
     * @return 工厂实例
     */
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("没有找到 " + classname + " 类。");
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}

package com.outlook.bigkun.concepts;

/**
 * 节点抽象类
 * 这种抽象节点含有所有方法的模式称为：透明组合模式，因为叶子节点其实不需要add和remove等方法，这可能会导致运行期出错
 *
 * @author zhanghk
 * @since 2019/7/30
 */
public interface Component {
    /**
     * 添加节点
     *
     * @param c
     */
    void add(Component c);

    /**
     * 移除节点
     *
     * @param c
     */
    void remove(Component c);

    /**
     * 根据索引获取节点
     *
     * @param i
     * @return
     */
    Component getChild(int i);

    /**
     * 业务相关方法
     */
    void bizMethod();
}

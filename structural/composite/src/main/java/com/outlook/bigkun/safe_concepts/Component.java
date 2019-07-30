package com.outlook.bigkun.safe_concepts;

/**
 * 节点抽象类
 * 抽象节点不含有add/remove等容器操作，只有容器节点才有，保证叶子节点不会因继承而具备容器节点特性
 * <p>
 * 安全组合模式
 *
 * @author zhanghk
 * @since 2019/7/30
 */
public interface Component {

    /**
     * 业务相关方法
     */
    void bizMethod();
}

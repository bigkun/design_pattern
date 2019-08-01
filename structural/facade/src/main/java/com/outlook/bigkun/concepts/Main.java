package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/1
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        // 外部调用者，无需关系内部子系统的逻辑
        facade.bizMethod();
    }
}

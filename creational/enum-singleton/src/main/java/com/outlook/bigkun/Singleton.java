package com.outlook.bigkun;

/**
 * @author zhanghk
 * @since 2019/7/13
 */
public enum Singleton {
    /**
     * 实例
     */
    INSTANCE;
    private static String string = "222";
    private static OtherClass otherClass = new OtherClass("other");

    static {
        System.out.println("static");
    }

    public String getName() {
        return "hello";
    }
}

package com.outlook.bigkun.clazz;


/**
 * @author zhanghk
 * @since 2019/7/23
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}

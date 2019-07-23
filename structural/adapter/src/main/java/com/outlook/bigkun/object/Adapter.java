package com.outlook.bigkun.object;

/**
 * @author zhanghk
 * @since 2019/7/23
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

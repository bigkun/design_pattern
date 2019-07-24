package com.outlook.bigkun.demo1;

/**
 * 定义基本功能
 * @author zhanghk
 * @since 2019/7/24
 */
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    /**
     * 基础的显示功能
     */
    public final void display() {
        open();
        print();
        close();
    }
}

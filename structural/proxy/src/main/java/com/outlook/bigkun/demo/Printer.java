package com.outlook.bigkun.demo;

import java.util.concurrent.TimeUnit;

/**
 * 真实主体
 * {@link com.outlook.bigkun.concepts.RealSubject}
 *
 * @author zhanghk
 * @since 2019/8/2
 */
public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("正在生成Printer实例");
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(".");
        }
        System.out.println("结束。");

    }

    public Printer(String name) {
        this.name = name;
        heavyJob("正在生成Printer实例 (" + name + ")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String str) {
        System.out.println("=== " + name + " ===");
        System.out.println(str);
    }
}

package com.outlook.bigkun.demo;

/**
 * 代理类
 * {@link com.outlook.bigkun.concepts.Proxy}
 *
 * @author zhanghk
 * @since 2019/8/2
 */
public class PrinterProxy implements Printable {
    private String name;
    private Printer real;

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String str) {
        realize();
        real.print(str);
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}

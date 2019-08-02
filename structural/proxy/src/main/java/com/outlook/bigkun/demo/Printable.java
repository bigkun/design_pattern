package com.outlook.bigkun.demo;

/**
 * 抽象主体
 * {@link com.outlook.bigkun.concepts.Subject}
 *
 * @author zhanghk
 * @since 2019/8/2
 */
public interface Printable {
    void setPrinterName(String name);

    String getPrinterName();

    void print(String str);
}

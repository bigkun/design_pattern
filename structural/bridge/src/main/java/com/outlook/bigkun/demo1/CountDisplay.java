package com.outlook.bigkun.demo1;

/**
 * 扩展的功能定义类
 *
 * @author zhanghk
 * @since 2019/7/24
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    /**
     * 扩展功能：多次显示能力
     *
     * @param times
     */
    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}

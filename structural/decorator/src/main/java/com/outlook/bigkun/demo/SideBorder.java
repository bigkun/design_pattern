package com.outlook.bigkun.demo;

/**
 * 在被装饰者两侧加边框
 * {@link com.outlook.bigkun.concepts.ConcreteDecorator}
 *
 * @author zhanghk
 * @since 2019/7/30
 */
public class SideBorder extends Border {
    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        // 在原始内容两边各加一个边框字符，所以需要原始宽度+2
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        // 并没有影响原始行数，所以与原始行数相同
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        // 在原始内容两侧各加一个边框字符
        return borderChar + display.getRowText(row) + borderChar;
    }
}

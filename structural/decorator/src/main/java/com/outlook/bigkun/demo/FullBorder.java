package com.outlook.bigkun.demo;

/**
 * 全边框，上下左右都加上边框
 * {@link com.outlook.bigkun.concepts.ConcreteDecorator}
 *
 * @author zhanghk
 * @since 2019/7/30
 */
public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        // 顶部和底部各家一行边框
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        String text = null;
        if (row > getRows() - 1 || row < 0) {
            text = null;
        } else if (row > 0 && row < getRows() - 1) {
            text = "|" + display.getRowText(row - 1) + "|";
        } else {
            text = "+" + makeLine("-", display.getColumns()) + "+";
        }
        return text;
    }

    private String makeLine(String s, int columns) {
        StringBuffer buffer = new StringBuffer(columns);
        for (int i = 0; i < columns; i++) {
            buffer.append(s);
        }
        return buffer.toString();
    }
}

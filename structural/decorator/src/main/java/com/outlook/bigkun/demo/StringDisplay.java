package com.outlook.bigkun.demo;

/**
 * 字符串显示类，具体实现类
 * 单行字符串
 * {@link com.outlook.bigkun.concepts.ConcreteComponent}
 *
 * @author zhanghk
 * @since 2019/7/30
 */
public class StringDisplay extends Display {
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    /**
     * 单行字符串，所以返回值固定为1
     *
     * @return
     */
    @Override
    public int getRows() {
        return 1;
    }

    /**
     * 因为是单行字符串，所以行号固定为0
     * 其他行号无效
     *
     * @param row
     * @return
     */
    @Override
    public String getRowText(int row) {
        return row == 0 ? string : null;
    }
}

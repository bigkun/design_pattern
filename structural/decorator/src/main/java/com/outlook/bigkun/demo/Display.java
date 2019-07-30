package com.outlook.bigkun.demo;

/**
 * 文字显示基类
 * 在一定的宽高的范围内打印字符图形
 * {@link com.outlook.bigkun.concepts.Component}
 *
 * @author zhanghk
 * @since 2019/7/30
 */
public abstract class Display {
    /**
     * 图形范围的宽度，以字符个数计算
     *
     * @return
     */
    public abstract int getColumns();

    /**
     * 图形范围的高度， 以字符个数计算
     *
     * @return
     */
    public abstract int getRows();

    /**
     * 根据行号获取对应行的文字
     *
     * @param row
     * @return
     */
    public abstract String getRowText(int row);

    /**
     * 依次逐行把文字图形打印出来
     */
    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}

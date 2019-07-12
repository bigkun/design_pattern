package com.outlook.bigkun.chart.impl;

import com.outlook.bigkun.chart.Chart;

/**
 * @author zhanghk
 * @since 2019/7/11
 */
public class LineChart implements Chart {
    public final static String TYPE = "Line";

    public LineChart() {
        System.out.println("创建折线图！");
    }

    @Override
    public void display() {
        System.out.println("显示折线图！");
    }
}

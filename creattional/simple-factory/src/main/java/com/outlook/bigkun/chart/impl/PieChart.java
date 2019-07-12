package com.outlook.bigkun.chart.impl;

import com.outlook.bigkun.chart.Chart;

/**
 * @author zhanghk
 * @since 2019/7/11
 */
public class PieChart implements Chart {
    public final static String TYPE = "Pie";

    public PieChart() {
        System.out.println("创建饼状图！");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图！");
    }
}

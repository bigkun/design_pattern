package com.outlook.bigkun.chart.impl;

import com.outlook.bigkun.chart.Chart;

/**
 * @author zhanghk
 * @since 2019/7/11
 */
public class HistogramChart implements Chart {
    public final static String TYPE = "Histogram";

    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图！");
    }
}

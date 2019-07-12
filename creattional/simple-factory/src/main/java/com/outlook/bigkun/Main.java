package com.outlook.bigkun;

import com.outlook.bigkun.chart.Chart;
import com.outlook.bigkun.chart.ChartFactory;
import com.outlook.bigkun.chart.impl.HistogramChart;
import com.outlook.bigkun.chart.impl.LineChart;

/**
 * @author zhanghk
 * @since 2019/7/11
 */
public class Main {
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart(HistogramChart.TYPE);
        chart.display();
        chart = ChartFactory.getChart(LineChart.TYPE);
        chart.display();
    }
}

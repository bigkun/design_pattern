package com.outlook.bigkun.chart;

import com.outlook.bigkun.chart.impl.HistogramChart;
import com.outlook.bigkun.chart.impl.LineChart;
import com.outlook.bigkun.chart.impl.PieChart;

/**
 * @author zhanghk
 * @since 2019/7/11
 */
public class ChartFactory {
    /**
     * 根据type实例化子类图表实例
     *
     * @param type
     * @return
     */
    public static Chart getChart(String type) {
        Chart chart = null;
        switch (type) {
            case HistogramChart.TYPE: {
                chart = new HistogramChart();
                System.out.println("初始化设置柱状图");
                break;
            }
            case PieChart
                    .TYPE: {
                chart = new PieChart();
                System.out.println("初始化设置饼状图");
                break;
            }
            case LineChart.TYPE: {
                chart = new LineChart();
                System.out.println("初始化设置折线图");
                break;
            }
            default:
        }

        return chart;
    }
}

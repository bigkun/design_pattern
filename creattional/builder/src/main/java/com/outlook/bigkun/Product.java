package com.outlook.bigkun;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghk
 * @since 2019/7/12
 */
public class Product {
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品 创建：");
        for (String p : parts) {
            System.out.println(p);
        }
    }
}

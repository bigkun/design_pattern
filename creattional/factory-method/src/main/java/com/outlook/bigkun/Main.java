package com.outlook.bigkun;

import com.outlook.bigkun.framework.Factory;
import com.outlook.bigkun.framework.Product;
import com.outlook.bigkun.idcard.IDCardFactory;

/**
 * @author zhanghk
 * @since 2019/7/11
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }
}

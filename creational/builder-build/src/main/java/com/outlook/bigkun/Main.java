package com.outlook.bigkun;

/**
 * @author zhanghk
 * @since 2019/7/12
 */
public class Main {

    public static void main(String[] args) {
        Product.Builder builder = new Product.Builder();
        Product product = builder.setName("产品1")
                .setWeight(100)
                .build();
        product.use();
    }
}

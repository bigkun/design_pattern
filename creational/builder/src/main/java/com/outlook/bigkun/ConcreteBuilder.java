package com.outlook.bigkun;

/**
 * @author zhanghk
 * @since 2019/7/12
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("Part A");
    }

    @Override
    public void buildPartB() {
        product.add("Part B");
    }

    @Override
    public void buildPartC() {
        product.add("Part C");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

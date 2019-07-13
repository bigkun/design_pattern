package com.outlook.bigkun;

/**
 * @author zhanghk
 * @since 2019/7/12
 */
public class Product {
    private String name;
    private int weight;

    private Product(Builder builder) {
        this.name = builder.name;
        this.weight = builder.weight;
    }

    public void use() {
        System.out.println("Name: " + name + " Weight: " + weight);
    }

    /**
     * Builder 可以作为内部类，也可以是单独的类
     * 另外，可以为{@link Product}类提供一个static方法来实例化builder，然后通过获得的builder再构建产品实例
     * {@code public static Builder newBuilder() {
     * return new Builder();
     * }}
     */
    public final static class Builder {
        private String name;
        private int weight;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}

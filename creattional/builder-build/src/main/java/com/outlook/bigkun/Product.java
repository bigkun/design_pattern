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

    public static class Builder {
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

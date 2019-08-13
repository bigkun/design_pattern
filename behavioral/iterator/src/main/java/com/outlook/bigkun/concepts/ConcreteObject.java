package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/13
 */
public class ConcreteObject {
    private String field;

    public ConcreteObject(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public String toString() {
        return "ConcreteObject{" +
                "field='" + field + '\'' +
                '}';
    }
}

package com.outlook.bigkun;

/**
 * @author zhanghk
 * @since 2019/7/22
 */
public class ConcretePrototype implements Prototype {
    /**
     * 域
     */
    private String field;

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public Prototype copy() {
        ConcretePrototype newer = new ConcretePrototype();
        newer.setField(this.getField());
        return newer;
    }
}

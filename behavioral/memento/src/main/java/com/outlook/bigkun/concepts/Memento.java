package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class Memento {
    public String state;

    public Memento(Originator originator) {
        state = originator.getState();
    }
}

package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class Originator {
    private String state;


    public Memento createMemento() {
        return new Memento(this);
    }
    public void restoreMemento(Memento memento) {
        state = memento.state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

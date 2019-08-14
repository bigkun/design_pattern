package com.outlook.bigkun.concepts;

import java.util.ArrayList;


/**
 * @author zhanghk
 * @since 2019/8/14
 */
public abstract class Subject {
    protected ArrayList<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notice();
}

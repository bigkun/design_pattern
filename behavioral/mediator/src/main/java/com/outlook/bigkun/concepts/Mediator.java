package com.outlook.bigkun.concepts;


import java.util.ArrayList;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public abstract class Mediator {
    protected ArrayList<Colleague> colleagues = new ArrayList<>();

    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    public abstract void operation();
}

package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class Context {
    private State state;
    private int value;

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }
}

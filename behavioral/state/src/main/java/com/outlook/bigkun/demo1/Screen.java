package com.outlook.bigkun.demo1;

/**
 * {@link com.outlook.bigkun.concepts.Context}
 * @author zhanghk
 * @since 2019/8/14
 */
public class Screen {
    private State currentState, normalState, largerState, largestState;

    public Screen() {
        normalState = new NormalState();
        largerState = new LargerState();
        largestState = new LargestState();
        currentState = normalState;
        currentState.display();

    }

    public void setState(State state) {
        currentState = state;
    }

    public void onClick() {
        if (currentState == normalState) {
            setState(largerState);

        } else if (currentState == largerState) {
            setState(largestState);
        } else if (currentState == largestState) {
            setState(normalState);
        }
        currentState.display();
    }
}

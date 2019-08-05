package com.outlook.bigkun.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zhanghk
 * @since 2019/8/2
 */
public class TimeHandler implements InvocationHandler {
    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    private void preHandle() {
        System.out.println("prepare move");
    }

    private void postHandle() {
        System.out.println("finished moving");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        preHandle();
        try {
            method.invoke(target);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        postHandle();
        return null;
    }
}

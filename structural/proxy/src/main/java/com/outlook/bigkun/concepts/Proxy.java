package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/2
 */
public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    private void preRequest() {
        System.out.println("preRequest");
    }

    private void postRequest() {
        System.out.println("postRequest");
    }

    @Override
    public void request() {
        preRequest();
        subject.request();
        postRequest();
    }
}

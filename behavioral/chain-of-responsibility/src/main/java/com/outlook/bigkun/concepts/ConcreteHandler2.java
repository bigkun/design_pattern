package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/5
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("2")) {
            System.out.println("The request:" + request + "was be handled by ConcreteHandler2");
        } else {
            successor.handleRequest(request);
        }
    }
}

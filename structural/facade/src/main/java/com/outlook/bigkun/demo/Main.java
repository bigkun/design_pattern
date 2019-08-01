package com.outlook.bigkun.demo;

/**
 * @author zhanghk
 * @since 2019/8/1
 */
public class Main {
    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        String encrypt = encryptFacade.fileEncrypt("I am bigkun.");
        System.out.println(encrypt);
    }
}

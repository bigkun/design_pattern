package com.outlook.bigkun.demo;

/**
 * @author zhanghk
 * @since 2019/8/1
 */
public class CipherMachine {

    public String encrypt(String plainText) {
        String es = "";
        char[] chars = plainText.toCharArray();
        for (char c : chars) {
            String ch = String.valueOf(c % 7);
            es += ch;
        }
        return es;
    }
}

package com.outlook.bigkun.demo;

/**
 * @author zhanghk
 * @since 2019/8/1
 */
public class EncryptFacade {
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade() {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    /**
     * 将给定的字符串进行加密
     *
     * @param content 原始字符串
     * @return 加密后的字符串
     */
    public String fileEncrypt(String content) {
        String plainText = reader.read(content);
        String encryptString = cipher.encrypt(plainText);
        StringBuffer stringBuffer = new StringBuffer();
        writer.write(encryptString, stringBuffer);
        return stringBuffer.toString();
    }
}

package com.outlook.bigkun.demo1;

/**
 * @author zhanghk
 * @since 2019/8/13
 */
public class Main {
    public static void main(String[] args) {
        String instruction = "up move 5 and down run 10 and left move 5";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);
        String outString = handler.output();
        System.out.println(outString);
    }
}

package com.outlook.bigkun.demo2;

/**
 * @author zhanghk
 * @since 2019/8/13
 */
public class Main {
    public static void main(String[] args) {
        try {
           String command = "program end\n" +
                   "program go end\n" +
                   "program go right go right go right end\n"+
                   "program repeat 4 go right end end\n"+
                   "program repeat 4 repeat 3 go right go left end right end end";

           String[] texts = command.split("\n");
           for (String text : texts) {
               Node node = new ProgramNode();
               node.parse(new Context(text));
               System.out.println("node = "+node);
           }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

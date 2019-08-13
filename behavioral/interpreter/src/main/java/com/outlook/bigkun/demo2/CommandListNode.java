package com.outlook.bigkun.demo2;

import java.util.ArrayList;

/**
 * @author zhanghk
 * @since 2019/8/13
 */
public class CommandListNode extends Node {
    private ArrayList list = new ArrayList();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

package com.outlook.bigkun.demo1;

import java.util.Stack;

/**
 * @author zhanghk
 * @since 2019/8/13
 */
public class InstructionHandler {
    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left = null;
        AbstractNode right = null;
        AbstractNode direction = null;

        AbstractNode action = null;
        AbstractNode distance = null;
        Stack stack = new Stack();
        String[] words = instruction.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("and")) {
                left = (AbstractNode) stack.pop();
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));
            } else {
                String word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }

        }
        this.node = (AbstractNode) stack.pop();
    }

    public String output() {
        String result = node.interpret();
        return result;
    }
}

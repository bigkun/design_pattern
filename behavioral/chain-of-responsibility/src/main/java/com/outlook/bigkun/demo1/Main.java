package com.outlook.bigkun.demo1;

/**
 * @author zhanghk
 * @since 2019/8/5
 */
public class Main {
    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elom = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elom).setNext(fred);
        for (int i = 0; i < 500; i++) {
            alice.support(new Trouble(i));
        }
    }
}

package com.outlook.bigkun.concepts;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Originator o = new Originator();
        o.setState("o1");
        System.out.println("state:"+o.getState());

        // 保存备忘录对象
        caretaker.setMemento(o.createMemento());
        // 更新Originator的状态
        o.setState("o2");
        System.out.println("state:"+o.getState());
        // 恢复
        o.restoreMemento(caretaker.getMemento());
        System.out.println("state:"+o.getState());

    }
}

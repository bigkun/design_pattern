package com.outlook.bigkun.demo1;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class Main {
    private static int index = -1;
    private static MementoCaretaker mc = new MementoCaretaker();

    public static void main(String[] args) {
        Chessman chessman = new Chessman("车", 1, 1);
        play(chessman);
        chessman.setY(4);
        play(chessman);
        chessman.setX(5);
        play(chessman);

        undo(chessman, index);
        undo(chessman, index);
        redo(chessman, index);
        redo(chessman, index);
    }

    private static void redo(Chessman chessman, int i) {
        System.out.println("****撤销悔棋****");
        index++;
        chessman.restore(mc.getMemento(i + 1));
        System.out.println(chessman);
    }

    private static void undo(Chessman chessman, int i) {
        System.out.println("****悔棋****");
        index--;
        chessman.restore(mc.getMemento(i - 1));
        System.out.println(chessman);
    }

    private static void play(Chessman chessman) {
        mc.setMemento(chessman.save());
        index++;
        System.out.println(chessman);
    }

}

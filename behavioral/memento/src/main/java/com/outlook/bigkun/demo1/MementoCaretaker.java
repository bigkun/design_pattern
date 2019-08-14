package com.outlook.bigkun.demo1;

import java.util.ArrayList;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class MementoCaretaker {
    private ArrayList<ChessmanMemento> mementoList = new ArrayList();

    public ChessmanMemento getMemento(int i) {
        return mementoList.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementoList.add(memento);
    }
}

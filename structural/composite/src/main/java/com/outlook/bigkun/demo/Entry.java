package com.outlook.bigkun.demo;

/**
 * @author zhanghk
 * @since 2019/7/30
 */
public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) {
        return null;
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String s);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}

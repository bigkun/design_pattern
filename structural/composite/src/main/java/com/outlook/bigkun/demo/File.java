package com.outlook.bigkun.demo;

/**
 * 叶子节点
 *
 * @author zhanghk
 * @since 2019/7/30
 */
public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String s) {
        System.out.println(s + "/" + this);
    }
}

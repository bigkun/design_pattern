package com.outlook.bigkun.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * 有单个或多个元素组成的页面
 * 用于表现内容
 *
 * @author zhanghk
 * @since 2019/7/10
 */
public abstract class Page {
    private final static String HTML_EXTENSION = ".html";
    protected String title;
    protected String author;
    /**
     * 用于承载页面内容
     */
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * 将元素添加到页面上
     *
     * @param item
     */
    public void add(Item item) {
        content.add(item);
    }

    /**
     * 将page的所有元素生成为html文件
     */
    public void output() {
        String filename = title + HTML_EXTENSION;
        Writer writer = null;
        try {
            writer = new FileWriter(filename);
            writer.write(makeHTML());
            writer.close();
            System.out.println(filename + "编写完成。");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected abstract String makeHTML();
}

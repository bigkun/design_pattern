package com.outlook.bigkun.tablefactory;

import com.outlook.bigkun.factory.Page;

/**
 * @author zhanghk
 * @since 2019/7/10
 */
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html>");
        return null;
    }
}

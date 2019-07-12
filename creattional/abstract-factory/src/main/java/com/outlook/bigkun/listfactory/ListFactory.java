package com.outlook.bigkun.listfactory;

import com.outlook.bigkun.factory.Factory;
import com.outlook.bigkun.factory.Link;
import com.outlook.bigkun.factory.Page;
import com.outlook.bigkun.factory.Tray;

/**
 * @author zhanghk
 * @since 2019/7/10
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}

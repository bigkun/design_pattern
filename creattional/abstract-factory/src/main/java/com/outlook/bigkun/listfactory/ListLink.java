package com.outlook.bigkun.listfactory;

import com.outlook.bigkun.factory.Link;

/**
 * @author zhanghk
 * @since 2019/7/10
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}

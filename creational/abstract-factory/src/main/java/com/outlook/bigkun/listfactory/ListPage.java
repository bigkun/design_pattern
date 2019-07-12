package com.outlook.bigkun.listfactory;

import com.outlook.bigkun.factory.Item;
import com.outlook.bigkun.factory.Page;

import java.util.Iterator;

/**
 * @author zhanghk
 * @since 2019/7/10
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>");
        buffer.append(title);
        buffer.append("</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>");
        buffer.append(title);
        buffer.append("</h1>\n");
        buffer.append("<ul>\n");
        Iterator iterator = content.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>");
        buffer.append(author);
        buffer.append("</address>");
        buffer.append("</body></html>\n");

        return buffer.toString();
    }
}

package com.outlook.bigkun.listfactory;

import com.outlook.bigkun.factory.Item;
import com.outlook.bigkun.factory.Tray;

import java.util.Iterator;

/**
 * @author zhanghk
 * @since 2019/7/10
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption);
        buffer.append("\n");
        buffer.append("<url>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");

        return buffer.toString();
    }
}

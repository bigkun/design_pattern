package com.outlook.bigkun;

import com.outlook.bigkun.factory.Factory;
import com.outlook.bigkun.factory.Link;
import com.outlook.bigkun.factory.Page;
import com.outlook.bigkun.factory.Tray;

/**
 * @author zhanghk
 * @since 2019/7/10
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.ListFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");
        Link us_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.com/");
        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);
        Tray trayyahoo= factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);

        Page page = factory.createPage("LinkPage", "bigkun");
        page.add(traynews);
        page.add(trayyahoo);
        page.output();
    }
}

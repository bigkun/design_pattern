package com.outlook.bigkun.concepts;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zhanghk
 * @since 2019/8/15
 */
public class ObjectStructure {
    private ArrayList<Element> list = new ArrayList<>();

    public void accept(Visitor visitor) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((Element) iterator.next()).accept(visitor);
        }
    }

    public void addElement(Element element) {
        list.add(element);
    }

    public void removeElement(Element element) {
        list.remove(element);
    }


}
